<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE>
<html>
<head>
    <title>SSE demo</title>
</head>
<body>
<div id="msgFromPush"></div>
<script src="assets/js/jquery.js"></script>
<script>
    if (!!window.EventSource) {
        var source = new EventSource('push');
        s = '';
        source.addEventListener('message', function(e) {
            s += e.data + "<br/>";
            $("#msgFromPush").html(s);
        });
        source.addEventListener('open', function(e) {
            console.log("连接打开。");
        }, false);
        source.addEventListener('error', function(e) {
            if (e.readyState == EventSource.CLOSED) {
                console.log("连接关闭.");
            } else {
                console.log(e.readyState);
            }
        }, false);
    } else {
        cosole.log('Your browser does not support SSE.');
    }
</script>
</body>
</html>
package com.lucky.messageconverter;

import com.lucky.domain.DemoObj;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * Created by lucky on 1/6/17.
 *
 * HttpMessageConverter是用来处理request和response里的数据
 *
 * 此例掩饰自定义的HttpMessageConverter，并注册这个HttpMessageConverter到SpringMVC
 */
// 继承AbstractHttpMessageConverter接口来实现自定义的HttpMessageConverter
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {
    public MyMessageConverter() {
        // 新建一个自定义的媒体类型application/x-wisely
        super(new MediaType("application", "x-wisely", Charset.forName("UTF-8")));
    }

    // 重写readInternal方法，处理请求的数据
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(inputMessage.getBody(), Charset.forName("UTF-8"));
        String[] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]), tempArr[1]);
    }

    // 表明本HttpMessageConverter只处理DemoObj这个类
    @Override
    protected boolean supports(Class<?> clazz) {
        return DemoObj.class.isAssignableFrom(clazz);
    }

    // 重写writeInternal，处理如何输出数据到response
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello: " + obj.getId() + "-" + obj.getName();
        outputMessage.getBody().write(out.getBytes());
    }
}

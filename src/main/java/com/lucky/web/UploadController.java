package com.lucky.web;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by lucky on 17-1-5.
 */
@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    // 使用MultipartFile file接收上传的文件
    public @ResponseBody String upload(MultipartFile file) {
        try {
            // 使用FileUtils.writeByteArrayToFile快速写文件到磁盘
            FileUtils.writeByteArrayToFile(new File("/home/lucky/Documents/Code/Java/upload/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}

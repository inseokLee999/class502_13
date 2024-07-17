package org.choongang.file.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
    @Value("${file.upload.path}")
    private String path;

    @GetMapping("/upload")
    public String file() {

        return "file/upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public void uploadPs(@RequestPart("file") MultipartFile file) throws IOException {
        String name = file.getOriginalFilename();
        log.info("파일명 : {}", name);
        File uploadPath = new File(path + name);
        file.transferTo(uploadPath);
    }
}

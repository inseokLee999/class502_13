package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

@WebServlet("/file/download")
public class FileDownloadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/uploads/20240419110132_2014645_874_809.jpg");
        String contentType = Files.probeContentType(file.toPath());
        String fileName = file.getName();
        //윈도우즈에서 한글 깨짐 문제 발생, 인코딩 UTF-8 -> 2바이트 CPC949,EUC-KR, ISO8859_1 String(bytes,charset)
        String _fileName = new String(fileName.getBytes(), "ISO8859-1");

        resp.setHeader("Content-Disposition", "attachment; filename="+_fileName);//다운로드 할 때 중요한 응답 헤더
        resp.setContentType(contentType);
        resp.setHeader("Cache-Control", "must-revalidate");
        resp.setIntHeader("Expires",0);
        resp.setContentLengthLong(file.length());

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
    }
}

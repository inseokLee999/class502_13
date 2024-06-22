package org.choongang.player.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;

public class FileDownloadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        File file = new File("D:/players/subin.png");//다운로드할 파일 경로,이름
        String contentType = Files.probeContentType(file.toPath());
        String fileName = file.getName();

        String _fileName = new String(fileName.getBytes(), "ISO8859-1");

        resp.setHeader("Content-Disposition","attachment; filename="+_fileName);
        resp.setContentType(contentType);
        resp.setHeader("Cache-Control","must-revalidate");
        resp.setIntHeader("Expires",0);
        resp.setContentLengthLong(file.length());
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
            OutputStream out = resp.getOutputStream();
            out.write(bis.readAllBytes());
        }
    }
}

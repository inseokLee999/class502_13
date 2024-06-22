package org.choongang.player.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/player/*")
public class PlayerSearchController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("req.getRequestURI : "+req.getRequestURI());
        String uri = req.getRequestURI().replace(req.getContextPath(), "");//uri에서
        System.out.println("uri : " + uri);

        Pattern pattern = Pattern.compile("^/player/(.+)");
        Matcher matcher = pattern.matcher(uri);
        if(matcher.find()) {
            String fileName = matcher.group(1);
            System.out.println(fileName);
            File file = new File("D:/uploads/player" + fileName);
            if(file.exists()) {
                Path source = file.toPath();
                String contentType = Files.probeContentType(source);
                resp.setContentType(contentType);
                try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
                    OutputStream out = resp.getOutputStream();
                    out.write(bis.readAllBytes());
                    return;
                }catch(Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }

}

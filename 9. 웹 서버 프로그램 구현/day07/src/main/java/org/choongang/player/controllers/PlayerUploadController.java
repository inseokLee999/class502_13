package org.choongang.player.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletDiskFileUpload;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

@WebServlet("/player/register")
public class PlayerUploadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/player/register.jsp");
        rd.forward(req, resp);//RequestDispatcher 를 위에 path값으로 forward
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload();

        List<DiskFileItem> list = upload.parseRequest(req);
//        System.out.println(Arrays.toString(list.toArray()));
        for(DiskFileItem fileItem : list) {
            if (fileItem.isFormField()) {
                String name = fileItem.getFieldName();
                String value = fileItem.getString(Charset.forName("UTF-8"));
                System.out.println(name + ":" + value);
                req.setAttribute(name, value);
            } else {
                String fileName = fileItem.getName();
                String contentType = fileItem.getContentType();
                long size = fileItem.getSize();
                System.out.printf("fileName:%s,contentType:%s,size:%s", fileName, contentType, size);

                File file = new File("D:/uploads/player/" + fileName);
                fileItem.write(file.toPath());
            }
        }
    }
}

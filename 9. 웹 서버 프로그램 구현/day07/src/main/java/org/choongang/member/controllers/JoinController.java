package org.choongang.member.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;

import java.io.IOException;
import java.io.PrintWriter;

import static org.choongang.global.MessageUtil.alertError;
import static org.choongang.global.MessageUtil.go;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/join.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            JoinService service = MemberServiceProvider.getInstance().joinService();
            service.process(req);
//            resp.sendRedirect(req.getContextPath() + "/member/login");//현재 창에서 이동하기 때문에 원치 않은 이동
            go(req.getContextPath()+"/member/login","parent",resp);

        }catch(CommonException e){
/*            resp.setContentType("text/html;charset=utf-8");
            resp.setStatus(e.getStatus());
            PrintWriter out = resp.getWriter();
            out.printf("<script>alert('%s');</script>", e.getMessage());//메세지를 script 로 띄워주기위하함*/
            alertError(e,resp);
        }
    }
}

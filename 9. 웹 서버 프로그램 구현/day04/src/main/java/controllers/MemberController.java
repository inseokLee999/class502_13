package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if(mode.equals("join")){
            joinForm(req,resp);
        }else if (mode.equals("login")){
            loginForm(req,resp);
        }
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mode = getMode(req);
        if(mode.equals("join")){
            joinProcess(req,resp);
        }else if (mode.equals("login")){
            loginProcess(req,resp);
        }
    }
    private String getMode(HttpServletRequest req){
        String url = req.getRequestURI();
        String[] urls = url.split("/");
        String mode = urls.length > 0 ? urls[urls.length - 1] : "";
        return mode;
    }
    //회원가입 양식
    private void joinForm(HttpServletRequest req,HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입 양식</h1>");
        out.println("<form>");
        out.println("이메일<input type='text' name='email'/><br>");
        out.println("비밀번호<input type='text' name='password'/><br>");
        out.println("비밀번호 확인<input type='text' name='confirmPassword'/><br>");
        out.println("</form>");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
    }
    //로그인 양식
    private void loginForm(HttpServletRequest req,HttpServletResponse resp) throws IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>로그인 양식</h1>");
    }
    //회원가입 처리
    private void joinProcess(HttpServletRequest req,HttpServletResponse resp){

    }
    //로그인 처리
    private void loginProcess(HttpServletRequest req,HttpServletResponse resp){

    }
}

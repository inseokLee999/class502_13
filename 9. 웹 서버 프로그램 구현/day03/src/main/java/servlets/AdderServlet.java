package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class AdderServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String str1 = req.getParameter("num1");
        String str2 = req.getParameter("num2");
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter out= resp.getWriter();
        out.println("<html>");
        out.println("<head><title>덧셈 프로그램 - 결과화면</title></head>");
        out.println("<body>");
        out.printf("%d + %d = %d", num1, num2, sum);
        out.println("</body>");
        out.println("</html>");
    }
}

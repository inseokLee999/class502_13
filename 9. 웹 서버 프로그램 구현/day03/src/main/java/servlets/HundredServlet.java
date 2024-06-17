package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HundredServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int total = 0;
        for(int i=0; i<101;i++){
            total += i;
        }
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println(total);
        out.println("</body>");
        out.println("</html>");
    }
}

package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter(value = "/*")
public class CommonFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()");
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.printf("key1 = %s, key2 = %s \n", key1, key2);
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("CommonFilter 요청 처리 전!");

        chain.doFilter(new CommonRequestWrapper(request),response);

        System.out.println("CommFilter 응답 후!");
    }



    @Override
    public void destroy() {
        System.out.println("destroy()");
    }
}

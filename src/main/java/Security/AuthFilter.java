//package Security;
//
//import jakarta.servlet.Filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("/AuthFilter/*")
//public class AuthFilter implements Filter {
//    public void init(FilterConfig filterConfig) throws ServletException {}
//
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//
//        HttpSession session = httpRequest.getSession(false);
//        if (session == null || session.getAttribute("user") == null) {
//            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
//        } else {
//            chain.doFilter(request, response);
//        }
//    }
//
//    public void destroy() {}
//}

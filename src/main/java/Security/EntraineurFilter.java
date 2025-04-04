package Security;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebFilter({"/Entraineur.jsp", "/Entraineur","/EntraineurServlet"})
public class EntraineurFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession session = request.getSession(false);

        if (session != null && "Entraineur".equals(session.getAttribute("role"))) {
            filterChain.doFilter(servletRequest, servletResponse); // Allow access
        } else {
            response.sendRedirect("Login.jsp?NoAccess=true"); // Redirect to login if unauthorized
        }
    }
}

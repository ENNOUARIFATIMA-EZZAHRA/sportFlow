package controller;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Objects;

import static Dao.LoginDao.FountTheUserRole;
import static Dao.LoginDao.Login;
//import static Dao.Logindao.FountTheUserRole;
//import static Dao.Logindao.Login;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (Login(email,password)!=0)
        {
            String role=FountTheUserRole(Login(email,password));
            HttpSession session = request.getSession(true);
            session.setAttribute("user", email);
            session.setAttribute("role", role);
            session.setAttribute("userid",Login(email,password));


            if (Objects.equals(role, "Member")) {
                response.sendRedirect("MemberServlet");
            }
            else  {
                response.sendRedirect("Entraineur.jsp");
            }

        }
        else {
            response.sendRedirect("Login.jsp");
        }


    }
}

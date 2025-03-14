package controller;
import Model.user;

import Dao.RegisterDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.lang.reflect.Member;
import java.util.Objects;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private RegisterDao user;

    public void init() {
        user = new RegisterDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user user = null;
        String nom = request.getParameter("Nom");
        String email = request.getParameter("Email");
        System.out.println(request.getParameter("Telephone"));
        int telephone = Integer.parseInt(request.getParameter("Telephone"));
        String password = request.getParameter("password");
        String role = request.getParameter("Role");
        System.out.println(role);

//        if (Objects.equals(role, "Member")) {
//
//            user user= new Member(nom, email, telephone, password);
//
//        else {
//            user = new Entraineur(nom,email,telephone,password);
//
//        }

        RegisterDao userDao= new RegisterDao();



        if (userDao.addUser(user)>0) {
            request.getSession().setAttribute("user", user.getNom());
            request.getSession().setAttribute("userid", userDao.addUser(user));
            request.getSession().setAttribute("role", user.getRole());

            if (role.equals("Member")) {
                response.sendRedirect("Member.jsp");

            }
            else {
                response.sendRedirect("EntraineurServlet");
            }

        } else {
            response.sendRedirect("Register.jsp?error=true");
        }


    }

}


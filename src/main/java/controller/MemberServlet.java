//package controller;
//
//import Dao.MemberDao;
//import Model.user;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//@WebServlet("/members")
//public class MemberServlet extends HttpServlet {
//    private MemberDao member;
//
//    @Override
//    public void init() throws ServletException {
//       user user= new user(Connection.getConnection());
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            List<MemberDao> members = member.getAllMembers();
//            request.setAttribute("members", members);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/membersList.jsp");
//            dispatcher.forward(request, response);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String nom = request.getParameter("nom");
//        String email = request.getParameter("email");
//        int telephone = Integer.parseInt(request.getParameter("telephone"));
//        String password = request.getParameter("password");
//        String dateNaissance = request.getParameter("dateNaissance");
//        String sportPratique = request.getParameter("sportPratique");
//
//        MemberDao member = new MemberDao(nom, email, telephone, password, dateNaissance, sportPratique, 0);
//
//        try {
//            member.createMember(member);
//            response.sendRedirect("members");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String nom = request.getParameter("nom");
//        String email = request.getParameter("email");
//        int telephone = Integer.parseInt(request.getParameter("telephone"));
//        String password = request.getParameter("password");
//        String dateNaissance = request.getParameter("dateNaissance");
//        String sportPratique = request.getParameter("sportPratique");
//
//        MemberDao member = new MemberDao(id, nom, email, telephone, password, dateNaissance, sportPratique);
//
//        try {
//            member.updateMember(member);
//            response.sendRedirect("members");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        try {
//            member.deleteMember(id);
//            response.sendRedirect("members");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//}

//package controller;
//
//import Model.Seance;
//import Model.user;
//import com.mysql.cj.jdbc.DatabaseMetaData;
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//@WebServlet("/AdminServlet")
//public class AdminServlet extends HttpServlet {
//    private user user;
////    private Model.Member member;
////    private Dao.Entraineur entraineur;
////    private Dao.Seance seance;
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        DatabaseMetaData DBConnection = null;
//        try {
//            user = new user(Connection.getConnection());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            member = new Model.Member(Connection.getConnection());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            entraineur = new Dao.Entraineur(DBConnection.getConnection());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            seance = new Dao.Seance(DBConnection.getConnection());
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            List<Model.Member> members = member.getAllMembers();
//            List<Dao.Entraineur> entraineurs = entraineur.getAllEntraineurs();
//            List<Seance> seances = seance.getAllSeances();
//            request.setAttribute("members", members);
//            request.setAttribute("entraineurs", entraineurs);
//            request.setAttribute("seances", seances);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/adminDashboard.jsp"); // Redirection vers le tableau de bord admin
//            dispatcher.forward(request, response);
//        } catch (SQLException | IOException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//}

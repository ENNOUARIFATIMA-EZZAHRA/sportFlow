//package controller;
//
//import Dao.Entraineur;
//import Model.Entraineur;
//import com.mysql.cj.jdbc.DatabaseMetaData;
//import jakarta.servlet.http.HttpServletRequest;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
//
//
//import static Utils.DatabaseConnector.getConnection;
//
//@WebServlet("/EntraineurServlet")
//public class EntraineurServlet extends HttpServlet {
//
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        Connection connection = null;
//        Entraineur= new entraineur(Connection.getConnection());
//    }
//
//    // Afficher tous les entraîneurs
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Entraineur> entraineurs = Entraineur.getAllEntraineurs();
//        request.setAttribute("entraineurs", entraineurs);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/entraineursList.jsp");
//        dispatcher.forward(request, response);
//    }
//
//    // Ajouter un nouveau entraîneur
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String nom = request.getParameter("nom");
//        String email = request.getParameter("email");
//        int telephone = Integer.parseInt(request.getParameter("telephone"));
//        String password = request.getParameter("password");
//        String specialite = request.getParameter("specialite");
//
//        Entraineur entraineur = new Entraineur(nom, email, telephone, password, specialite);
//
//        try {
//            Entraineur.createEntraineur(entraineur);
//            response.sendRedirect("entraineurs");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    // Modifier un entraîneur
//    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String nom = request.getParameter("nom");
//        String email = request.getParameter("email");
//        int telephone = Integer.parseInt(request.getParameter("telephone"));
//        String password = request.getParameter("password");
//        String specialite = request.getParameter("specialite");
//
//        Entraineur entraineur = new Entraineur(id, nom, email, telephone, password, specialite);
//
//        try {
//            Entraineur.updateEntraineur(entraineur);
//            response.sendRedirect("entraineurs");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    // Supprimer un entraîneur
//    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        try {
//            Entraineur.deleteEntraineur(id);
//            response.sendRedirect("entraineurs");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//}

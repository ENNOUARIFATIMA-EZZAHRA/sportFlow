//package controller;
//
//import Dao.Seance;
//
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.*;
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Timestamp;
//import java.util.List;
//
//@WebServlet("/SeancesServlet")
//public class SeanceServlet extends HttpServlet {
//    private Seance seance;
//
//    @Override
//    public void init() throws ServletException {
//        super.init();
//        Connection connection=null;
//        seance = new Seance(Connection.getConnection());
//    }
//
//    // Afficher les séances d'un membre ou entraîneur
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int memberId = Integer.parseInt(request.getParameter("id_member"));
//        int entraineurId = Integer.parseInt(request.getParameter("id_entraineur"));
//
//        try {
//            List<seance> seances = null;
//            if (memberId > 0) {
//
//                List <Seance> Seances = null;
//                seances = Seances.getSeancesByMember(memberId);
//            } else if (entraineurId > 0) {
//                seances = seance.getSeancesByEntraineur(entraineurId);
//            }
//
//            request.setAttribute("seances", seances);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/seancesList.jsp");
//            dispatcher.forward(request, response);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    // Ajouter une nouvelle séance
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int idMember = Integer.parseInt(request.getParameter("id_member"));
//        int idEntraineur = Integer.parseInt(request.getParameter("id_entraineur"));
//        String dateHeure = request.getParameter("date_heure");
//
//        Seance seance = new Seance(idMember, idEntraineur, Timestamp.valueOf(dateHeure));
//
//        try {
//            Seance.createSeance(seance);
//            response.sendRedirect("seances");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    // Modifier une séance
//    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        int idMember = Integer.parseInt(request.getParameter("id_member"));
//        int idEntraineur = Integer.parseInt(request.getParameter("id_entraineur"));
//        String dateHeure = request.getParameter("date_heure");
//
//        Seance seance = new seance(id, idMember, idEntraineur, Timestamp.valueOf(dateHeure));
//
//        try {
//            Seance.updateSeance(seance);
//            response.sendRedirect("seances");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//
//    // Supprimer une séance
//    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        try {
//            seance.deleteSeance(id);
//            response.sendRedirect("seances");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            response.sendRedirect("error.jsp");
//        }
//    }
//}

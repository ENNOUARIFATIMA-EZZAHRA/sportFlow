package controller;


import Dao.CandidateDao;
import Model.Offer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/MemberServlet")
public class MemberServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            listMember(req,resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void listMember(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        List<Seance> listSeance = MemberDao.getListSeance();
     RequestDispatcher dispatcher = request.getRequestDispatcher("Member.jsp");
        request.setAttribute("listSeance", listSeance);
       dispatcher.forward(request, response);
    }
}

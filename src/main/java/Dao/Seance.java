//package Dao;
//
//import Model.Seance;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Seance {
//    private Connection connection;
//
//    public Seance(Connection connection) {
//        this.connection = connection;
//    }
//
//    public Seance(int idMember, int idEntraineur, Timestamp timestamp) {
//    }
//
//    public void createSeance(Seance seance) throws SQLException {
//        String sql = "INSERT INTO seances (id_member, id_entraineur, date_heure) VALUES (?, ?, ?)";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, seance.getIdMember());
//            stmt.setInt(2, seance.getIdEntraineur());
//            stmt.setTimestamp(3, seance.getDateHeure());
//            stmt.executeUpdate();
//        }
//    }
//
//
//
//    public List<Seance> getSeancesByMember(int memberId) throws SQLException {
//        List<Seance> seances = new ArrayList<>();
//        String sql = "SELECT * FROM seances WHERE id_member = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, memberId);
//            try (ResultSet rs = stmt.executeQuery()) {
//                while (rs.next()) {
//                    Seance seance = new Seance(
//                            rs.getInt("id");
//                            rs.getInt("id_member");
//                            rs.getInt("id_entraineur");
//                            rs.getTimestamp("date_heure"));
//
//                    seances.add(seance);
//                }
//            }
//        }
//        return seances;
//    }
//
//    public List<Seance> getSeancesByEntraineur(int entraineurId) throws SQLException {
//        List<Seance> seances = new ArrayList<>();
//        String sql = "SELECT * FROM seances WHERE id_entraineur = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, entraineurId);
//            try (ResultSet rs = stmt.executeQuery()) {
//                while (rs.next()) {
//                    Seance seance = new Seance(
//                            rs.getInt("id");
//                            rs.getInt("id_member");
//                            rs.getInt("id_entraineur");
//                            rs.getTimestamp("date_heure");
//
//                    seances.add(seance);
//                }
//            }
//        }
//        return seances;
//    }
//
//    public void updateSeance(Seance seance) throws SQLException {
//        String sql = "UPDATE seances SET id_member = ?, id_entraineur = ?, date_heure = ? WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, seance.getIdMember());
//            stmt.setInt(2, seance.getIdEntraineur());
//            stmt.setTimestamp(3, seance.getDateHeure());
//            stmt.setInt(4, seance.getId());
//            stmt.executeUpdate();
//        }
//    }
//
//    public void deleteSeance(int seanceId) throws SQLException {
//        String sql = "DELETE FROM seances WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, seanceId);
//            stmt.executeUpdate();
//        }
//    }
//}

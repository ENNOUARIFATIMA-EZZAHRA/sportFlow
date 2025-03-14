//package DAO;
//
//import Model.Entraineur;
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Entraineur{
//    private Connection connection;
//
//    public Entraineur(Connection connection) {
//        this.connection = connection;
//    }
//
//    public void createEntraineur(Entraineur entraineur) throws SQLException {
//        String sql = "INSERT INTO entraineurs (nom, email, telephone, password, specialite) VALUES (?, ?, ?, ?, ?)";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setString(1, entraineur.getNom());
//            stmt.setString(2, entraineur.getEmail());
//            stmt.setInt(3, entraineur.getTelephone());
//            stmt.setString(4, entraineur.getPassword());
//            stmt.setString(5, entraineur.getSpecialite());
//            stmt.executeUpdate();
//        }
//    }
//
//    public List<Entraineur> getAllEntraineurs() throws SQLException {
//        List<Entraineur> entraineurs = new ArrayList<>();
//        String sql = "SELECT * FROM entraineurs";
//        try (PreparedStatement stmt = connection.prepareStatement(sql);
//             ResultSet rs = stmt.executeQuery()) {
//            while (rs.next()) {
//                Entraineur entraineur = new Entraineur(
//                        rs.getInt("id"),
//                        rs.getString("nom"),
//                        rs.getString("email"),
//                        rs.getInt("telephone"),
//                        rs.getString("password"),
//                        rs.getString("specialite")
//                );
//                entraineurs.add(entraineur);
//            }
//        }
//        return entraineurs;
//    }
//
//    public void updateEntraineur(Entraineur entraineur) throws SQLException {
//        String sql = "UPDATE entraineurs SET nom = ?, email = ?, telephone = ?, password = ?, specialite = ? WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setString(1, entraineur.getNom());
//            stmt.setString(2, entraineur.getEmail());
//            stmt.setInt(3, entraineur.getTelephone());
//            stmt.setString(4, entraineur.getPassword());
//            stmt.setString(5, entraineur.getSpecialite());
//            stmt.setInt(6, entraineur.getId());
//            stmt.executeUpdate();
//        }
//    }
//
//    public void deleteEntraineur(int entraineurId) throws SQLException {
//        String sql = "DELETE FROM entraineurs WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, entraineurId);
//            stmt.executeUpdate();
//        }
//    }
//}

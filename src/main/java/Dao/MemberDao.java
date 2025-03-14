//package Dao;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MemberDao {
//    private Connection connection;
//
//    public MemberDao(Connection connection) {
//        this.connection = connection;
//    }
//
//
//
//    public void createMember(MemberDao member) throws SQLException {
//        String sql = "INSERT INTO membres (nom, email, telephone, password, date_naissance, sport_pratique) VALUES (?, ?, ?, ?, ?, ?)";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setString(1, member.getNom());
//            stmt.setString(2, member.getEmail());
//            stmt.setInt(3, member.getTelephone());
//            stmt.setString(4, member.getPassword());
//            stmt.setString(5, MemberDao.getDateNaissance());
//            stmt.setString(6, member.getSportPratique());
//            stmt.executeUpdate();
//        }
//    }
//
//
//
//    public List<MemberDao> getAllMembers() throws SQLException {
//        List<MemberDao> members = new ArrayList<>();
//        String sql = "SELECT * FROM membres";
//        try (PreparedStatement stmt = connection.prepareStatement(sql);
//             ResultSet rs = stmt.executeQuery()) {
//            while (rs.next()) {
//                MemberDao member = new MemberDao(
//                        rs.getInt("id");
//                        rs.getString("nom");
//                        rs.getString("email");
//                        rs.getInt("telephone");
//                        rs.getString("password");
//                        rs.getString("date_naissance");
//                        rs.getString("sport_pratique");
//
//                members.add(member);
//            }
//        }
//        return members;
//    }
//
//    public void updateMember(MemberDao member) throws SQLException {
//        String sql = "UPDATE membres SET nom = ?, email = ?, telephone = ?, password = ?, date_naissance = ?, sport_pratique = ? WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setString(1, member.getNom());
//            stmt.setString(2, member.getEmail());
//            stmt.setInt(3, member.getTelephone());
//            stmt.setString(4, member.getPassword());
//            stmt.setString(5, member.getDateNaissance());
//            stmt.setString(6, member.getSportPratique());
//            stmt.setInt(7, member.getId());
//            stmt.executeUpdate();
//        }
//    }
//
//
//
//    public void deleteMember(int memberId) throws SQLException {
//        String sql = "DELETE FROM membres WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, memberId);
//            stmt.executeUpdate();
//        }
//    }
//
//    public MemberDao getMemberById(int id) throws SQLException {
//        String sql = "SELECT * FROM membres WHERE id = ?";
//        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
//            stmt.setInt(1, id);
//            try (ResultSet rs = stmt.executeQuery()) {
//                if (rs.next()) {
//                    return new MemberDao(
//                            rs.getInt("id");
//                            rs.getString("nom");
//                            rs.getString("email");
//                            rs.getInt("telephone");
//                            rs.getString("password");
//                            rs.getString("date_naissance");
//                            rs.getString("sport_pratique");
//
//                }
//            }
//        }
//        return null;
//    }
//}

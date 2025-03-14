//package Model;
//
//import java.sql.Date;
//import java.util.List;
//
//public class Member extends user {
//    private String dateNaissance;
//    private String sportPratique;
//    private int userId;
//
//    public Member(int id, String nom, String email, int telephone, String password, int userId, String dateNaissance, String sportPratique) {
//        super(id, nom, email, telephone, password);
//        this.userId = userId;
//        this.dateNaissance = dateNaissance;
//        this.sportPratique = sportPratique;
//    }
//
//    public Member(String nom, String email, int telephone, String password, String dateNaissance, String sportPratique, int userId) {
//        super(nom, email, telephone, password);
//        this.dateNaissance = dateNaissance;
//        this.sportPratique = sportPratique;
//        this.userId = userId;
//    }
//
//
//    public Date getDateNaissance() {
//        return dateNaissance;
//    }
//
//    public void setDateNaissance(String dateNaissance) {
//        this.dateNaissance = dateNaissance;
//    }
//
//    public String getSportPratique() {
//        return sportPratique;
//    }
//
//    public void setSportPratique(String sportPratique) {
//        this.sportPratique = sportPratique;
//    }
//
//    @Override
//    public String getRole() {
//        return "Member";
//    }
//
//    public List<Member> getAllMembers() {
//    }
//}
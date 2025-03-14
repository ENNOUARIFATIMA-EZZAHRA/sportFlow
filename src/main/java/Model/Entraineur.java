//package Model;
//
//import java.util.List;
//
//public class Entraineur extends user {
//    private String specialite;
//    private int userId;
//
//    public Entraineur(int id, String nom, String email, int telephone, String password, int userId, String specialite) {
//        super(id, nom, email, telephone, password);
//        this.specialite = specialite;
//        this.userId = userId;
//    }
//
//    public Entraineur(String nom, String email, int telephone, String password, String specialite, int userId) {
//        super(nom, email, telephone, password);
//        this.specialite = specialite;
//        this.userId = userId;
//    }
//
//    public static List<Entraineur> getAllEntraineurs() {
//    }
//
//    public static void createEntraineur(Entraineur entraineur) {
//    }
//
//    public static void updateEntraineur(Entraineur entraineur) {
//    }
//
//
//    public String getSpecialite() {
//        return specialite;
//    }
//
//    public void setSpecialite(String specialite) {
//        this.specialite = specialite;
//    }
//
//    @Override
//    public String getRole() {
//        return "Entraineur";
//    }
//}

//package Model;
//
//import java.sql.Timestamp;
//import java.util.List;
//
//public class Seance extends user {
//    private int id;
//    private int idMember;
//    private int idEntraineur;
//    private Timestamp dateHeure;
//    private int userId;
//
//    public Seance(int id, String nom, String email, int telephone, String password, int userId, int idMember, int idEntraineur, Timestamp dateHeure) {
//        super(id, nom, email, telephone, password);
//        this.idMember = idMember;
//        this.idEntraineur = idEntraineur;
//        this.dateHeure = dateHeure;
//        this.userId = userId;
//    }
//
//    public Seance(String nom, String email, int telephone, String password, int idMember, int idEntraineur, Timestamp dateHeure) {
//        super(nom, email, telephone, password);
//        this.idMember = idMember;
//        this.idEntraineur = idEntraineur;
//        this.dateHeure = dateHeure;
//    }
//
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getIdMember() {
//        return idMember;
//    }
//
//    public void setIdMember(int idMember) {
//        this.idMember = idMember;
//    }
//
//    public int getIdEntraineur() {
//        return idEntraineur;
//    }
//
//    public void setIdEntraineur(int idEntraineur) {
//        this.idEntraineur = idEntraineur;
//    }
//
//    public Timestamp getDateHeure() {
//        return dateHeure;
//    }
//
//    public void setDateHeure(Timestamp dateHeure) {
//        this.dateHeure = dateHeure;
//    }
//
//    @Override
//    public String getRole() {
//        return "Seance";
//    }
//
//    public List<Dao.Seance> getSeancesByMember(int memberId) {
//    }
//
//    public List<Dao.Seance> getSeancesByEntraineur(int entraineurId) {
//    }
//}
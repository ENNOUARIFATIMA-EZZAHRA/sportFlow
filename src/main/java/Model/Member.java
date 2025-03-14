package Model;

import java.sql.Date;

public class Member extends user  {

    private  int id ;
    private  String nom ;
    private  String dateNaissance;
    private String sport_pratique;
    private  int user_Id ;

    public Member(int id,String nom, String email, int telephone, String password, int user_Id, String dateNaissance, String sport_pratique) {
         super(nom, email, telephone, password);
        this.dateNaissance = dateNaissance;
        this.sport_pratique = sport_pratique;
        this.user_Id = user_Id;
    }

    public Member( String nom, String email, int telephone, String password, String dateNaissance, String sport_pratique, int userId) {
        super(id,nom, email, telephone, password);
        this.user_Id = userId;
        this.dateNaissance = dateNaissance;
        this.sport_pratique = sport_pratique;

    }

 public Member( String nom, String email, int telephone, String password) {
      super(nom, email, telephone, password);

    }
 public Member() {
   

    }

    public Member(int userId) {
        user_Id = userId;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getRole() {
        return "Member";
    }

    @Override
    public Date getDateNaissance() {
        return null;
    }

    @Override
    public String getSportPratique() {
        return "";
    }

    public String getdateNaissance() {
        return dateNaissance;
    }

    public void setdateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        user_Id = user_Id;
    }
}

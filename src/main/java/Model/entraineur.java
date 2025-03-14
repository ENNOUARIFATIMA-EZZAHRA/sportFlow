package Model;

import java.sql.Date;

public class Entraineur extends user {
    private int id;
    private String nom;
    private String specialite;
    private  int user_Id;

    public Entraineur(int id,String nom, String email, int telephone, String password, String specialite, int user_Id) {
super(nom, email, telephone, password);
        user_Id = user_Id;
        this.nom=nom;
        this.specialite= specialite;

    }

    public Entraineur(String nom, String email, int telephone, String password, int user_Id, String specialite) {
 super(id, nom, email, telephone, password);
        user_Id = user_Id;
        this.nom=nom;
        this.specialite = specialite;
    }

    public Entraineur(String nom, String email, int telephone, String password) {
        super( nom, email, telephone, password);
    }
public Entraineur() {
    
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
        return "Entraineur";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}

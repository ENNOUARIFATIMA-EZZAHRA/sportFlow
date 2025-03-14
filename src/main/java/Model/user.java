package Model;

import java.sql.Date;

public abstract class user {
    private  int id;
    private  String nom;
    private  String email;
    private  int telephone ;
    private  String password;

    public user(int id, String nom, String email, int telephone, String password) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public user(String nom, String email, int telephone, String password) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
    }

    public user() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract String getRole();  // Abstract method

    public  abstract Date getDateNaissance();

    public  abstract String getSportPratique();
}

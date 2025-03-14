package Dao;

import java.sql.*;

import Model.user;


import static Utils.DatabaseConnector.getConnection;

public class RegisterDao {



    public RegisterDao() {}

    public int addUser(user user) {
        String InsertToUser = "INSERT INTO user (nom,email,Telephone,password,Role) VALUES (?, ?,?,?,?)";
        String InsertToMember = "INSERT into Member (Id_User,nom,dateNaissance,sport_pratique) VALUES (?,?,?,?)";
        String InsertToEntraineur= "INSERT into Entraineur  (Id_User,nom,specialite,) VALUES (?,?,?)";


        try (Connection connection = getConnection();
             PreparedStatement preparedStatementUser = connection.prepareStatement(InsertToUser, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement prepareStatementCandidate = connection.prepareStatement(InsertToMember);
             PreparedStatement prepareStatementRecruteur = connection.prepareStatement(InsertToEntraineur)
        ) {
            preparedStatementUser.setString(1, user.getNom());
            preparedStatementUser.setString(2, user.getEmail());
            preparedStatementUser.setInt(3, user.getTelephone());
            preparedStatementUser.setString(4, user.getPassword());
            preparedStatementUser.setString(5, user.getRole());

            preparedStatementUser.executeUpdate();

            ResultSet generatedKeys = preparedStatementUser.getGeneratedKeys();

            if (user.getRole().equals("Member")) {
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);
                    prepareStatementCandidate.setInt(1, userId);


                    prepareStatementCandidate.executeUpdate();
                    System.out.println("UserId: " + userId);
                    return userId  ;

                }
            }
            else {
                if (generatedKeys.next()) {
                    int userId = generatedKeys.getInt(1);
//                    prepareStatementEntraineur.setInt(1, userId);
//                    prepareStatementEntraineur.executeUpdate();
                    System.out.println("UserId: " + userId);
                    return userId  ;

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return  0;
    }
}

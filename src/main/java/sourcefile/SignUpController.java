package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SignUpController {

    @FXML
    private PasswordField tf_confirm_password;

    @FXML
    private TextField tf_email;

    @FXML
    private PasswordField tf_password;

    @FXML
    private TextField tf_profession;

    @FXML
    private TextField tf_username;

    private static String hostAddress = "jdbc:mysql://localhost:3306/mega_apps_for_games";
    private static String DB_user = "root";
    private static String DB_password = "";

    private String user_name;
    private String user_password;
    private String user_confirm_password;
    private String user_email;
    private String user_profession;


    @FXML
    private void registered(ActionEvent event) throws IOException {
        String uploadINFO = null;

        user_name = tf_username.getText();
        user_password = tf_password.getText();
        user_confirm_password = tf_confirm_password.getText();
        user_email = tf_email.getText();
        user_profession = tf_profession.getText();

        try{
        // Registering the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connection creation
        Connection connection = DriverManager.getConnection(hostAddress, DB_user, DB_password);

        // Statement creation
        Statement statement = connection.createStatement();

        //Querie executing
        uploadINFO = "INSERT INTO user_details" + "\nVALUES ('" +  user_name +"','"+ user_password +"','"+ user_confirm_password +"','"+ user_email +"','"+ user_profession + "')";
        
        //System.out.println(uploadINFO);

        statement.executeUpdate(uploadINFO);

        // closing the statement and connection
        statement.close();
        connection.close();
        }catch(Exception e){
            System.out.println(e);
        }

        Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Registration Status:");
            alert.setContentText("You have successfully registered!");
            alert.showAndWait();
    }
    

    @FXML
    private void switchToMain(ActionEvent event) throws IOException {
        Main.setRoot("main");
    }

}


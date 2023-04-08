package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
// import javafx.scene.control.PasswordField;
// import javafx.scene.control.TextField;

public class MainController {


    @FXML
    private void switchToSignUp(ActionEvent event) throws IOException {
        Main.setRoot("sign-up");
    }

    @FXML
    void switchToSignIn(ActionEvent event) throws IOException{
        Main.setRoot("sign-in");
    }
    

}



// package sourcefile;

// import java.io.IOException;
// import javafx.fxml.FXML;

// public class PrimaryController {

//     @FXML
//     private void switchToSecondary() throws IOException {
//         Main.setRoot("secondary");
//     }
// }

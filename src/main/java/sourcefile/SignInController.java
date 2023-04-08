package sourcefile;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SignInController {

    @FXML
    private void switchToMain(ActionEvent event) throws IOException {
        Main.setRoot("main");
    }

}

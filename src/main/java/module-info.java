module sourcefile {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens sourcefile to javafx.fxml;
    exports sourcefile;
}

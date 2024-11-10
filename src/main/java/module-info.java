module com.emadesko {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.emadesko to javafx.fxml;
    exports com.emadesko;
}

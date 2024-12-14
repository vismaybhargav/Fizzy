module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens org.vismayb to javafx.fxml;
    exports org.vismayb;
}
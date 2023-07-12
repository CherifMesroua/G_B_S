module com.example.javafx_materialfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx_materialfx to javafx.fxml;
    exports com.example.javafx_materialfx;
}
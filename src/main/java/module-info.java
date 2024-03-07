module com.example.fx_simplenav {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fx_simplenav to javafx.fxml;
    exports com.example.fx_simplenav;
}
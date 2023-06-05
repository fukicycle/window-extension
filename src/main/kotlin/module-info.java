module javafx.window.base.windowextension {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens javafx.window.base.windowextension to javafx.fxml;
    exports javafx.window.base.windowextension;
}
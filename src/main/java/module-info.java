module com.francis.trianglecreator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.francis.trianglecreator to javafx.fxml;
    exports com.francis.trianglecreator;
}
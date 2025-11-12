module fatec.lanchoneteapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens fatec.lanchoneteapp.app to javafx.fxml;
    exports fatec.lanchoneteapp.app;
    exports fatec.lanchoneteapp.adapters.ui;
}
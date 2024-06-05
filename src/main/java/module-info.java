module de.fallmerayer.slfserver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens de.fallmerayer.slfserver to javafx.fxml;
    exports de.fallmerayer.slfserver;
    exports de.fallmerayer.slfserver.controller;
    opens de.fallmerayer.slfserver.controller to javafx.fxml;
}
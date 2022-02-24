module com.example.qualitelogiciel {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;

    opens com.example.qualitelogiciel to javafx.fxml;
    exports com.example.qualitelogiciel;
    opens com.example.qualitelogiciel.controller to javafx.fxml;
    exports com.example.qualitelogiciel.controller;
    opens com.example.qualitelogiciel.model to javafx.fxml;
    exports com.example.qualitelogiciel.model;
}
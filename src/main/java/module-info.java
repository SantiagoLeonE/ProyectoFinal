module co.edu.uniquindio.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;

    opens co.edu.uniquindio.proyectofinal to javafx.fxml;
    exports co.edu.uniquindio.proyectofinal;

    opens co.edu.uniquindio.proyectofinal.controller;
    exports co.edu.uniquindio.proyectofinal.controller;

    opens co.edu.uniquindio.proyectofinal.viewcontroller;
    exports co.edu.uniquindio.proyectofinal.viewcontroller;

    exports co.edu.uniquindio.proyectofinal.mapping.dto;
}
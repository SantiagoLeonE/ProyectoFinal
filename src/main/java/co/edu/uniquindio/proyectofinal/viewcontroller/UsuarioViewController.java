package co.edu.uniquindio.proyectofinal.viewcontroller;

import co.edu.uniquindio.proyectofinal.MarketplaceApplication;
import co.edu.uniquindio.proyectofinal.controller.UsuarioController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UsuarioViewController {
    private final UsuarioController usuarioController = new UsuarioController();
    public Stage loginStage;

    public void setPrimaryStage(Stage loginStage) {
        this.loginStage = loginStage;
    }

    @FXML
    private Button btnCreateAccount;

    @FXML
    private Button btnSignIn;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void onIniciarSesion(ActionEvent event) {
        buscarUsuario();
    }

    @FXML
    void onCrearCuenta(ActionEvent event) {

    }

    private void buscarUsuario() {
        if(usuarioController.buscarUsuario(txtUsername.getText())) {
            try {
                abrirNuevaVentana();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Usuario no encontrado");
        }
    }

    private void abrirNuevaVentana() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("usuario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        Stage userStage = new Stage();
        userStage.setTitle("Nueva ventana");
        userStage.setScene(scene);
        userStage.show();
        loginStage.close();
    }

}



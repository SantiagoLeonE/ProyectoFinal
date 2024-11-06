package co.edu.uniquindio.proyectofinal.viewcontroller;

import co.edu.uniquindio.proyectofinal.MarketplaceApplication;
import co.edu.uniquindio.proyectofinal.controller.UsuarioController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class UsuarioViewController {
    private final UsuarioController usuarioController = new UsuarioController();
    public Stage loginStage;

    public void setLoginStage(Stage loginStage) {
        this.loginStage = loginStage;
    }

    @FXML
    private Button btnCreateAccount;

    @FXML
    private Button btnSignIn;

    @FXML
    private Button btnPublicarProductos;

    @FXML
    private Button btnChats;

    @FXML
    private Button btnContactos;

    @FXML
    private Button btnConfiguracion;

    @FXML
    private Button btnEstadisticas;

    @FXML
    private Button btnCerrarSesion;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    private CheckBox userCheckBox;

    @FXML
    private CheckBox adminCheckBox;

    @FXML
    void onIniciarSesion(ActionEvent event) {
        buscarUsuario();
    }

    @FXML
    void onCrearCuenta(ActionEvent event) {
        checkBox();
    }

    @FXML
    void onPublicarProductos(ActionEvent event) {

    }

    @FXML
    void onChats(ActionEvent event) {

    }

    @FXML
    void onAgregarContactos(ActionEvent event) {

    }

    @FXML
    void onConfigurarInformacion(ActionEvent event) {

    }

    @FXML
    void onVerEstadisticas(ActionEvent event) {

    }

    @FXML
    void onCerrarSesion(ActionEvent event) {

    }

    public void checkBox() {
        if(userCheckBox.isSelected() && adminCheckBox.isSelected()) {
            System.out.println("No se pueden seleccionar las dos opciones al tiempo");
        }
        else if(userCheckBox.isSelected()) {
            System.out.println("Usuario");
        }
        else if(adminCheckBox.isSelected()) {
            System.out.println("Administrador");
        }
        else {
            System.out.println("No hay una opción seleccionada");
        }
    }

    private void buscarUsuario() {
        if(usuarioController.buscarUsuario(txtUsername.getText())) {
            try {
                abrirVentanaVendedor();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Usuario no encontrado");
        }
    }

    private void abrirVentanaVendedor() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("usuario.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage userStage = new Stage();
        userStage.setTitle("Vendedor");
        userStage.setScene(scene);
        userStage.show();
        loginStage.close();
    }

}



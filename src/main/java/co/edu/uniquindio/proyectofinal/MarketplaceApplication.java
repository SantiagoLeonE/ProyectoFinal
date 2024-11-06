package co.edu.uniquindio.proyectofinal;

import co.edu.uniquindio.proyectofinal.viewcontroller.UsuarioViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MarketplaceApplication extends Application {

    @Override
    public void start(Stage loginStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MarketplaceApplication.class.getResource("login.fxml"));
        Parent root = fxmlLoader.load();
        UsuarioViewController viewController = fxmlLoader.getController();

        viewController.setLoginStage(loginStage);

        Scene scene = new Scene(root);
        loginStage.setTitle("Marketplace Login");
        loginStage.setScene(scene);
        loginStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
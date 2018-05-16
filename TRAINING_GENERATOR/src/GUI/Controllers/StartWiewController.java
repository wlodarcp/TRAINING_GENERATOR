package GUI.Controllers;

import GUI.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;



public class StartWiewController extends Controller {

    public void showLogOrRegistration(){
        application.StartWiewController.show();
    }

    public void handleLog(ActionEvent event) throws IOException{
        System.out.println("LOGOWANIE");
        final FXMLLoader loader = new FXMLLoader(Main.class.getResource("../sourceFiles/logPane.fxml"));
        loader.load();
        final Controller controller = loader.getController();
        controller.configure(application, new Scene(loader.getRoot()));
        controller.setPreviousController(this);
        controller.show();

    }

    public void handleRegistration(ActionEvent event){
        System.out.println("REJESTRACJA");
    }
}

package GUI.Controllers;

import GUI.Main;
import javafx.scene.Scene;

public class Controller {
    protected Main application;
    protected Scene scene;
    private Controller previousController;

    public void configure(final Main application, final Scene scene) {
        this.application = application;
        this.scene = scene;
    }
    public void setPreviousController(final Controller previousController) {
        this.previousController = previousController;
    }

    public void show() {
        application.show(scene);
    }

    public void backToPreviousScene()
    {
        previousController.show();
    }


}

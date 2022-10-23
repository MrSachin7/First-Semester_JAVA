package lsjndvfkfsd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("Calculator.fxml"
        ));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("hbkadbf");
        stage.setScene(scene);
        stage.show();

    }
}

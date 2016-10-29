package arena;

import java.net.URL;
import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class Arena extends Application {
	@Override
	public void start(Stage stage) {
                URL fxmlURL = getClass().getResource("Arena.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
		Parent root;

		try {
                	root = (Parent)fxmlLoader.load();
		} catch (IOException e) {
			System.out.println("Couldn't load Arena.fxml!");
			Platform.exit();
			return;
		}

                Scene scene = new Scene(root, 300, 300);

                stage.setTitle("Arena");
                stage.setScene(scene);
                stage.show();
        }
}

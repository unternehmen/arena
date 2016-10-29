package arena;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.binding.StringExpression;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ArenaController implements Initializable {
	@FXML
	private ImageView avatarView;
	@FXML
	private Label nameLabel;
	@FXML
	private Label fansLabel;
	@FXML
	private Label goldLabel;
	@FXML
	private Button button;

	/**
	 * Return a string property whose value is always the value
	 * of s concatenated to the value of e.
	 * @return the new string property
	 */
	static StringExpression cat(String s, StringExpression e) {
		return new SimpleStringProperty(s).concat(e);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Character character = new Character();
		character.setName("Gede");

		/* Load the player character image. */
		avatarView.setImage(new Image("file:arena/roman.png"));

		/* Bind name label to the player's name. */
		nameLabel
		  .textProperty()
		  .bind(cat("Name: ", character.nameProperty()));

		/* Bind fans label to the player's number of fans. */
		fansLabel
		  .textProperty()
		  .bind(cat("Fans: ",
		            character.fansProperty().asString("%d")));

		/* Bind gold label to the player's gold. */
		goldLabel
		  .textProperty()
		  .bind(cat("Gold: ",
		            character.goldProperty().asString("%d")));

		/* Hook up the "instant gold" button. */
		button.setOnAction(e -> character.changeGold(1));
	}
}

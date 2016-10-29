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
	private Label fameLabel;
	@FXML
	private Label skillLabel;
	@FXML
	private Label goldLabel;
	@FXML
	private Button moneyButton;
	@FXML
	private Button skillButton;
	@FXML
	private Button fameButton;
	@FXML
	private Button sponsorButton;

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
		avatarView
		  .setImage(
		    new Image(
		      getClass()
		        .getResource("roman.png")
		        .toExternalForm()));

		/* Bind name label to the player's name. */
		nameLabel
		  .textProperty()
		  .bind(cat("Name: ", character.nameProperty()));

		/* Bind fame label to the player's fame. */
		fameLabel
		  .textProperty()
		  .bind(cat("Fame: ",
		            character.fameProperty().asString("%d")));

		/* Bind skill label to the player's skill. */
		skillLabel
		  .textProperty()
		  .bind(cat("Skill: ",
		            character.skillProperty().asString("%d")));

		/* Bind gold label to the player's gold. */
		goldLabel
		  .textProperty()
		  .bind(cat("Gold: ",
		            character.goldProperty().asString("%d")));

		/* Hook up the "instant gold" button. */
		moneyButton.setOnAction(e -> character.changeGold(1));
		fameButton.setOnAction(e -> character.changeFame(1));
		skillButton.setOnAction(e -> character.changeSkill(1));
	}
}

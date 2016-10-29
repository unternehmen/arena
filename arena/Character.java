package arena;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Character {
	private StringProperty name;
	private IntegerProperty gold;
	private IntegerProperty fame;
	private IntegerProperty skill;

	public Character() {
		name = new SimpleStringProperty("");
		gold = new SimpleIntegerProperty(0);
		fame = new SimpleIntegerProperty(0);
		skill = new SimpleIntegerProperty(0);
	}

	/* Property accessors/mutators. */

	public final String getName() { return name.get(); }

	public final void setName(String value) { name.set(value); }

	public StringProperty nameProperty() { return name; }

	public final int getGold() { return gold.get(); }

	public final void setGold(int value) { gold.set(value); }

	public final void changeGold(int value) {
		gold.set(gold.get() + value);
	}

	public IntegerProperty goldProperty() { return gold; }

	public final int getFame() { return fame.get(); }

	public final void setFame(int value) { fame.set(value); }

	public final void changeFame(int value) {
		fame.set(fame.get() + value);
	}

	public IntegerProperty fameProperty() { return fame; }

	public final int getSkill() { return skill.get(); }

	public final void setSkill(int value) { skill.set(value); }

	public final void changeSkill(int value) {
		skill.set(skill.get() + value);
	}

	public IntegerProperty skillProperty() { return skill; }
}

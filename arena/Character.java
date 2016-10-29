package arena;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;

public class Character {
	private StringProperty name;
	private IntegerProperty gold;
	private IntegerProperty fans;

	public Character() {
		name = new SimpleStringProperty("");
		gold = new SimpleIntegerProperty(0);
		fans = new SimpleIntegerProperty(0);
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

	public final int getFans() { return fans.get(); }

	public final void setFans(int value) { fans.set(value); }

	public final void changeFans(int value) {
		fans.set(fans.get() + value);
	}

	public IntegerProperty fansProperty() { return fans; }
}

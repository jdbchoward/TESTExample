package PageObjects;

public class CommonActions {

	private ParseProperties settings;
	private String parsePath = "src\\test\\resources\\Setting.properties";

	public ParseProperties getSettings() {
		return new ParseProperties(parsePath);
	}

}


public enum TrafficLight {
	Green("綠燈"), Yellow("黃燈"), Red("紅燈");

	private final String color;

	TrafficLight(String color) {
		this.color = color;
	}

	public String getcolor() {
		return this.color;
	}

	public String toString() {
		switch (this) {
		case Green:
			return Green.getcolor() + ",請通行";

		case Yellow:
			return Yellow.getcolor() + ",請減速";

		case Red:
			return Red.getcolor() + ",請停車";

		default:
			return null;
		}
	}

}

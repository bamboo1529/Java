
public enum TrafficLight {
	Green("��O"), Yellow("���O"), Red("���O");

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
			return Green.getcolor() + ",�гq��";

		case Yellow:
			return Yellow.getcolor() + ",�д�t";

		case Red:
			return Red.getcolor() + ",�а���";

		default:
			return null;
		}
	}

}

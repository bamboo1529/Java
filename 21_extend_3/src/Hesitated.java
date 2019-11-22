
public class Hesitated extends Player {

	Hesitated(String name) {
		super(name);
	}

	boolean buyStrategy() {
		double s = Math.random();
		if (s > 0.5)
			return true;
		else
			return false;
	}

}

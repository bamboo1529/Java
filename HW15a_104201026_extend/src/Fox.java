
public class Fox extends Animal {

	Fox(String name) {
		super(name);
	}

	public String toString() {
		return "Fox";
	}

	public void move() {
		System.out.printf("%s is wlaking...\n", super.getName());
	}
}

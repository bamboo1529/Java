
public class Lion extends Animal {

	Lion(String name) {
		super(name);
	}

	public String toString() {
		return "Lion";
	}

	public void move() {
		System.out.printf("%s is running...\n", super.getName());
	}

}

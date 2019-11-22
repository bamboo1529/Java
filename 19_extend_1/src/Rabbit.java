
public class Rabbit extends Animal {

	Rabbit(String name) {
		super(name);
	}

	public String toString() {
		return "Rabbit";
	}

	public void move() {
		System.out.printf("%s is jumping...\n", super.getName());
	}
}


public class Animal {
	String name0;

	Animal(String name) {
		this.name0 = name;
	}

	String getName() {
		return this.name0;
	}

	void move() {
		System.out.printf("%s is moving...\n", name0);
	}

	void eat() {
		System.out.printf("%s is eating...\n", name0);
	}

	void sleep() {
		System.out.printf("%s is sleeping...\n", name0);
	}
}

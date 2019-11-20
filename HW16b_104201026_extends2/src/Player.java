
public abstract class Player {

	String name;
	int money = 2000;
	int location;

	Player(String name) {
		this.name = name;
	}

	void move() {

		int random = (int) (Math.random() * 6 + 1);
		location += random;

		if (location > 39) {
			location -= 39;
		}

		System.out.printf("%s ¨«¤F %d ¨B\n", name, random);
	}

	void payPrice(Land place) {

		money -= place.price / 2;
		place.owner.money += place.price / 2;

	}

	abstract boolean buyStrategy();

}

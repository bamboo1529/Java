
public class Pineapple extends Fruit {

	Pineapple(double price, int quantity) {
		super(price, quantity);
	}

	public double calc() {
		return super.getPrice() * super.getquantiyt();
	}
}

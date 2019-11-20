
public class Papaya extends Fruit {

	Papaya(double price, int quantity) {
		super(price, quantity);
	}

	public double calc() {
		return super.getPrice() * super.getquantiyt();
	}
}

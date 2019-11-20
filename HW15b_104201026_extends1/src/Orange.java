
public class Orange extends Fruit {

	Orange(double price, int quantity) {
		super(price, quantity);
	}

	public double calc() {
		return super.getPrice() * super.getquantiyt();
	}
}

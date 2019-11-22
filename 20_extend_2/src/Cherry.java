
public class Cherry extends Fruit {

	private double tax = 1.1;

	Cherry(double price, int quantity) {
		super(price, quantity);
	}

	public double calc() {
		return super.getPrice() * super.getquantiyt() * tax;
	}
}

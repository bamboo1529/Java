
public abstract class Fruit {
	private double price;
	private int quantiyt;

	Fruit(double price, int quantity) {
		setPrice(price);
		setquantiyt(quantity);
	}

	void setPrice(double p) {
		this.price = p;
	}

	double getPrice() {
		return this.price;
	}

	void setquantiyt(int q) {
		this.quantiyt = q;
	}

	int getquantiyt() {
		return this.quantiyt;
	}

	public abstract double calc();
}

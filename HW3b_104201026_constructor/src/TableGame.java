
public class TableGame {

	private String name;
	private int price;
	private int overdue;

	public TableGame(int initprice, int initoverdue) {
		this.price = initprice;
		this.overdue = initoverdue;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPrice(int p) {
		this.price = p;
	}

	public int getPrice() {
		return this.price;
	}

	public void setOverdue(int o) {
		this.overdue = o;
	}

	public int getOverdue() {
		return this.overdue;
	}

	public int getRental() {
		return (this.getPrice() / 10);
	}

	public int getOverdueFine() {
		return (this.getOverdue() * 8);
	}

	public int getTotalCost() {
		return (this.getRental() + this.getOverdueFine());
	}
}

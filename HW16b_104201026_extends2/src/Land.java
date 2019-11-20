
public class Land {

	int price;
	String place;
	Player owner;

	public Land(String place, int price) {
		this.place = place;
		this.price = price;
	}

	void setOwner(Player p) {
		if (p.money > price) {
			p.money -= price;
			owner = p;
			System.out.printf("%s 買了 %s , 現在有錢 %d\n", p.name, place, p.money);
		} else {
			System.out.printf("由於現金不足 , %s 沒有買地\n", p.name);
		}
	}

}

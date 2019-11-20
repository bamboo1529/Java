
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
			System.out.printf("%s �R�F %s , �{�b���� %d\n", p.name, place, p.money);
		} else {
			System.out.printf("�ѩ�{������ , %s �S���R�a\n", p.name);
		}
	}

}

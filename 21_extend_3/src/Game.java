
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] land = { "中華民國", "日本", "韓國", "菲律賓", "馬來西亞", "越南", "泰國", "印度", "伊拉克", "伊朗", "沙烏地阿拉伯", "土耳其", "以色列",
				"蘇俄", "波蘭", "德國", "奧地利", "瑞士", "法國", "比利時", "荷蘭", "英國", "芬蘭", "瑞典", "丹麥", "希臘", "義大利", "西班牙", "葡萄牙",
				"埃及", "摩洛哥", "南非", "加拿大", "美國", "墨西哥", "宏都拉斯", "尼加拉瓜", "古巴", "巴拿馬", "巴西" };

		String[] PN = { "A", "B", "C", "D" };

		Land[] place = new Land[land.length];

		Player[] p = new Player[PN.length];

		for (int i = 0; i < land.length; i++) {
			place[i] = new Land(land[i], (int) (Math.random() * 1000) + 1);
		}

		p[0] = new Happy(PN[0]);
		p[1] = new Hesitated(PN[1]);
		p[2] = new Hesitated(PN[2]);
		p[3] = new Stingy(PN[3]);

		for (int i = 1; i <= 50; i++) {

			System.out.printf("\n第  %s  輪\n\n", i);

			for (int j = 0; j < 4; j++) {

				p[j].move();

				System.out.printf("%s 在 %s, 現在有錢 %d\n", p[j].name, land[p[j].location], p[j].money);

				if (place[p[j].location].owner == null) {

					System.out.printf("%s 目前尚未出售 , 地價為 %d\n", land[p[j].location], place[p[j].location].price);

					switch (j) {
					case 0:
						if (p[j].buyStrategy()) {
							System.out.printf("%s 心情好 , 買買買都買\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						}
						break;
					case 1:
						if (p[j].buyStrategy()) {
							System.out.printf("%s 猶豫了很久 , 最後還是決定買了\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						} else {
							System.out.printf("%s 猶豫了很久 , 最後還是決定不買\n", p[j].name);
						}
						break;
					case 2:
						if (p[j].buyStrategy()) {
							System.out.printf("%s 猶豫了很久 , 最後還是決定買了\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						} else {
							System.out.printf("%s 猶豫了很久 , 最後還是決定不買\n", p[j].name);
						}
						break;
					case 3:
						if (!p[j].buyStrategy()) {
							System.out.printf("%s 是個小氣的人 , 打死不買\n", p[j].name);
						}
						break;
					}

				}

				else if (place[p[j].location].owner != p[j]) {

					System.out.printf("%s 屬於 %s\n", land[p[j].location], place[p[j].location].owner.name);
					System.out.printf("%s 要付給 %s %d 過路費\n", p[j].name, place[p[j].location].owner.name,
							place[p[j].location].price / 2);

					p[j].payPrice(place[p[j].location]);

					System.out.printf("%s 在 %s, 現在有錢 %d\n", p[j].name, land[p[j].location], p[j].money);
				}

				else {
					System.out.printf("%s 走到自己的地\n", p[j].name);
				}

				System.out.print("-----------------\n");

			}
		}

		for (int k = 0; k < 100; k++) {
			for (int z = 0; z < 3; z++) {
				if (p[z].money < p[z + 1].money) {
					Player player = p[z];
					p[z] = p[z + 1];
					p[z + 1] = player;
				}
				
			}
		}

		for (int z = 0; z < 4; z++) {
			System.out.printf("第%d名為 %s , 總共有 %d 元\n", z+1, p[z].name, p[z].money);
		}

	}

}

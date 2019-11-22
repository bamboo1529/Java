
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] land = { "���إ���", "�饻", "����", "��߻�", "���Ӧ��", "�V�n", "����", "�L��", "��ԧJ", "���", "�F�Q�a���ԧB", "�g�ը�", "�H��C",
				"Ĭ�X", "�i��", "�w��", "���a�Q", "��h", "�k��", "��Q��", "����", "�^��", "����", "���", "����", "��þ", "�q�j�Q", "��Z��", "�����",
				"�J��", "������", "�n�D", "�[���j", "����", "�����", "�����Դ�", "���[�ԥ�", "�j��", "�ڮ���", "�ڦ�" };

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

			System.out.printf("\n��  %s  ��\n\n", i);

			for (int j = 0; j < 4; j++) {

				p[j].move();

				System.out.printf("%s �b %s, �{�b���� %d\n", p[j].name, land[p[j].location], p[j].money);

				if (place[p[j].location].owner == null) {

					System.out.printf("%s �ثe�|���X�� , �a���� %d\n", land[p[j].location], place[p[j].location].price);

					switch (j) {
					case 0:
						if (p[j].buyStrategy()) {
							System.out.printf("%s �߱��n , �R�R�R���R\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						}
						break;
					case 1:
						if (p[j].buyStrategy()) {
							System.out.printf("%s �S�ݤF�ܤ[ , �̫��٬O�M�w�R�F\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						} else {
							System.out.printf("%s �S�ݤF�ܤ[ , �̫��٬O�M�w���R\n", p[j].name);
						}
						break;
					case 2:
						if (p[j].buyStrategy()) {
							System.out.printf("%s �S�ݤF�ܤ[ , �̫��٬O�M�w�R�F\n", p[j].name);
							place[p[j].location].setOwner(p[j]);
						} else {
							System.out.printf("%s �S�ݤF�ܤ[ , �̫��٬O�M�w���R\n", p[j].name);
						}
						break;
					case 3:
						if (!p[j].buyStrategy()) {
							System.out.printf("%s �O�Ӥp�𪺤H , �������R\n", p[j].name);
						}
						break;
					}

				}

				else if (place[p[j].location].owner != p[j]) {

					System.out.printf("%s �ݩ� %s\n", land[p[j].location], place[p[j].location].owner.name);
					System.out.printf("%s �n�I�� %s %d �L���O\n", p[j].name, place[p[j].location].owner.name,
							place[p[j].location].price / 2);

					p[j].payPrice(place[p[j].location]);

					System.out.printf("%s �b %s, �{�b���� %d\n", p[j].name, land[p[j].location], p[j].money);
				}

				else {
					System.out.printf("%s ����ۤv���a\n", p[j].name);
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
			System.out.printf("��%d�W�� %s , �`�@�� %d ��\n", z+1, p[z].name, p[z].money);
		}

	}

}

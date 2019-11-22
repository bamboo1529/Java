import java.util.ArrayList;
import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String message1 = "";
		String message2 = "";

		Date doginday = null;
		Date catinday = null;
		try {
			doginday = new Date(1, 20, 2017);
			catinday = new Date(6, 18, 2017);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String[][] dogArr = { { "編號", "名字", "性別", "年齡" }, { "1", "蛋白", "公狗", "3歲" }, { "2", "Angela", "母狗", "1歲" },
				{ "3", "雞腿", "公狗", "5歲" }, { "4", "點點", "公狗", "2歲" } };

		String[][] catArr = { { "編號", "名字", "性別", "年齡" }, { "1", "巧虎", "公貓", "2歲" }, { "2", "喵嗚", "公貓", "1歲" },
				{ "3", "花花", "母貓", "3歲" }, { "4", "波妞", "母貓", "6歲" } };

		ArrayList<String[][]> animallist = new ArrayList();
		animallist.add(dogArr);
		animallist.add(catArr);

		Animal[] dogs = new Animal[5];
		for (int i = 0; i < 5; i++) {
			dogs[i] = new Animal();
			dogs[i].setname(animallist.get(0)[i][1]);
			dogs[i].setgender(animallist.get(0)[i][2]);
			dogs[i].setage(animallist.get(0)[i][3]);
			dogs[i].setdate(doginday);
		}

		Animal[] cats = new Animal[5];
		for (int i = 0; i < 5; i++) {
			cats[i] = new Animal();
			cats[i].setname(animallist.get(1)[i][1]);
			cats[i].setgender(animallist.get(1)[i][2]);
			cats[i].setage(animallist.get(1)[i][3]);
			cats[i].setdate(catinday);
		}

		Animal[] animalkeep = new Animal[2];

		System.out.println("========歡迎收養流讓貓狗========");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				message1 += animallist.get(0)[i][j] + "\t";
			}
			message1 += "\n";
		}
		System.out.print(message1);

		System.out.print("請輸入想要認養的編號:");
		int number1 = input.nextInt();

		input.nextLine();

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				message2 += animallist.get(1)[i][j] + "\t";
			}
			message2 += "\n";
		}
		System.out.print(message2);

		System.out.print("請輸入想要認養的編號:");
		int number2 = input.nextInt();

		animalkeep[0] = dogs[number1];
		animalkeep[1] = cats[number2];

		System.out.println("========認養清單========");

		System.out.println("名子\t性別\t年齡\t入園日期");

		System.out.println(animalkeep[0]);
		System.out.println(animalkeep[1]);

		System.out.println("========謝謝您的認養========");

	}

}

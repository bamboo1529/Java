import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int time;
		int frcy = 0;
		int much = 500;
		
		System.out.print("�п�J�p�{�����{��:\n");
		int mileage = input.nextInt() - 1500;
		
		System.out.print("�O�_�������ɶ�(�п�JYes/No):\n");
		input.nextLine();
		String answer = input.nextLine();
		
		while(mileage > 0){
			mileage -= much;
			much += 50;
			frcy += 1 ;
			};
		
		if(answer.equals("Yes")) {
			System.out.print("�п�J�����ɶ���������:\n");
			time = input.nextInt();
			System.out.printf("���{��%d��\n",frcy*5+70);
			System.out.printf("�����ɶ���%d��\n",(time/3)*5 );
			System.out.printf("�`�@%d��",frcy*5+70+(time/3)*5 );
			}
		if(answer.equals("No"))
			System.out.printf("�`�@%d��",frcy*5+70);
;		
	}

}

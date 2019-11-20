import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int time;
		int frcy = 0;
		int much = 500;
		
		System.out.print("請輸入計程車里程數:\n");
		int mileage = input.nextInt() - 1500;
		
		System.out.print("是否有延滯時間(請輸入Yes/No):\n");
		input.nextLine();
		String answer = input.nextLine();
		
		while(mileage > 0){
			mileage -= much;
			much += 50;
			frcy += 1 ;
			};
		
		if(answer.equals("Yes")) {
			System.out.print("請輸入延滯時間的分鐘數:\n");
			time = input.nextInt();
			System.out.printf("里程為%d元\n",frcy*5+70);
			System.out.printf("延滯時間為%d元\n",(time/3)*5 );
			System.out.printf("總共%d元",frcy*5+70+(time/3)*5 );
			}
		if(answer.equals("No"))
			System.out.printf("總共%d元",frcy*5+70);
;		
	}

}

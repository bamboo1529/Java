import java.util.Scanner;

public class TableGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		TableGame myTableGame = new TableGame(0,0);
		
		System.out.print("customer's name :");
		String name = input.nextLine();
		myTableGame.setName(name);
		
		System.out.print("What's the original price of this table game? :");
		int price = input.nextInt();
		myTableGame.setPrice(price);
		
		
		System.out.print("How long is this table game overdue? :");
		int overdue = input.nextInt();
		myTableGame.setOverdue(overdue);
		
		System.out.println();
		
		System.out.printf("Your rental is : $%d \n" , myTableGame.getRental());
		
		if ( myTableGame.getOverdueFine() * 8 < 800)
			System.out.printf("Your overdue fine is : $%d \n" , myTableGame.getOverdueFine() );
		
		if ( myTableGame.getOverdueFine() * 8 >= 800)
			System.out.printf("Your overdue fine is : $%d \n" , 800 );
		
		if ( myTableGame.getOverdueFine() * 8 < 800)
			System.out.printf("Your total cost is : $%d \n" , myTableGame.getTotalCost() );
		
		if ( myTableGame.getOverdueFine() * 8 >= 800)
			System.out.printf("Your total cost is : $%d \n" , myTableGame.getRental() + 800 );


	}

}

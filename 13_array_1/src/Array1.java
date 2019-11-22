import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String string1;
		String message = "";
		char [] array10;
		do{
			System.out.print("Enter a word:");
			string1 = input.nextLine();
		}while( string1.length() != 7 );
		
		array10 = new char[7];
		
		for(int i = 0 ; i < 7 ; i++) {array10[i] = string1.charAt(i);}
		//array1 = string1.toCharArray();¬Û¦P
				
		for(int i = 0 ; i < 6 ; i++)
			{message += Math.abs(array10[i]-array10[i+1]);}
		
		System.out.print("Your password is:"+message.substring(0,6));
		
		
	
	}

}

import java.util.Scanner;

public class Static0 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String message = "";

		System.out.print("�п�J�@�ӥ����:");
		int number = input.nextInt();
		
		while(number > 2) {
			int number0 = checkPrime(number);
			if(number0 == 0) message = message + number + ",";
			else;
			number --;
		}
		message = message + "2";
		System.out.print(message);
	}
		
	public static int checkPrime(int number00) {
		int z = 0;
		for(int i = 2; i <= Math.sqrt(number00);i++) {
			if(number00 % i == 0)z++;		
			else ;
		}
		return z;//�p�Gz�^��0  �N��z�O���
	}
}
	


import java.util.Scanner;
public class Numbertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Findmax Findmax000 = new Findmax();
		Findmin Findmin000 = new Findmin();

		System.out.print("叫块计 (筳秨) :");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		Findmax000.setnumber1(number1);
		Findmax000.setnumber2(number2);
		Findmax000.setnumber3(number3);
		
		Findmin000.setnumber1(number1);
		Findmin000.setnumber2(number2);
		Findmin000.setnumber3(number3);
		
		System.out.printf("程: %d\n",Findmax.max());
		System.out.printf("程: %d\n",Findmin.min());
		System.out.printf("程㎝程縩: %d",Findmin.min()*Findmax.max());

		
		
	}

}

import java.util.Scanner;
public class Numbertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		Findmax Findmax000 = new Findmax();
		Findmin Findmin000 = new Findmin();

		System.out.print("�п�J�T�ӼƦr (�H�Ů�j�}) :");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		Findmax000.setnumber1(number1);
		Findmax000.setnumber2(number2);
		Findmax000.setnumber3(number3);
		
		Findmin000.setnumber1(number1);
		Findmin000.setnumber2(number2);
		Findmin000.setnumber3(number3);
		
		System.out.printf("�̤j�Ȭ�: %d\n",Findmax.max());
		System.out.printf("�̤p�Ȭ�: %d\n",Findmin.min());
		System.out.printf("�̤j�ȩM�̤p�Ȫ����n��: %d",Findmin.min()*Findmax.max());

		
		
	}

}

// �ƾǤTB 104201026 ���`��
// �o�O�@������scanner���G��

import java.util.Scanner;

public class Scannered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String name;
		double high;
		int kg;
		int sum1;
		double sum2;

		System.out.print("�W�l: ");
		name = input.nextLine();

		System.out.print("����(����): ");
		high = input.nextDouble();

		System.out.print("�魫(����): ");
		kg = input.nextInt();

		sum1 = (int) (kg / ((high/100) * (high/100)));

		sum2 = kg / ((high/100) * (high/100));

		System.out.printf("BMI��(���): %d\n", sum1);
		System.out.printf("BMI��(�B�I��): %f", sum2);

		}
}

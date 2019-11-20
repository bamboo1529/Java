// 數學三B 104201026 蔡曜謙
// 這是一個關於scanner的故事

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

		System.out.print("名子: ");
		name = input.nextLine();

		System.out.print("身高(公分): ");
		high = input.nextDouble();

		System.out.print("體重(公斤): ");
		kg = input.nextInt();

		sum1 = (int) (kg / ((high/100) * (high/100)));

		sum2 = kg / ((high/100) * (high/100));

		System.out.printf("BMI值(整數): %d\n", sum1);
		System.out.printf("BMI值(浮點數): %f", sum2);

		}
}

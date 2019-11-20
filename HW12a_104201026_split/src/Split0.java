import java.util.Scanner;

public class Split0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String[] array1;
		boolean tf;
		int number1 = 0;
		
		System.out.print("請依序輸入數字(以空白隔開):");
		String string1 = input.nextLine();
		
		array1 = string1.split(" ");
		
		int[] array2 = new int [array1.length];
		
		for(int i = 0 ; i < array1.length ;i++)
			array2[i] = Integer.valueOf(array1[i]);
		
		do {
			tf = false;
			for(int j = 0 ; j < array2.length-1 ; j++ ){
				if(array2[j] < array2[j+1]) {
					number1 = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = number1;
					tf = true;
				}
			}	
		}while(tf);
		
		System.out.print("排序後的結果為:");
		
		for (int s : array2) {System.out.print(s+" ");}

	}
}

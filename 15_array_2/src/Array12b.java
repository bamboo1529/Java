import java.util.Scanner;
import java.security.SecureRandom;
public class Array12b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int repeat0 = 0;
		int repeat = 0;	
		int over = 0;
		int number1; 
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		
		System.out.print("�ۿ︹�X�п�J1 ; �q���︹��2 :");
		number1 = input.nextInt();
		input.nextLine();

		if(number1 == 2){
			array1[0] = (int)(Math.random()*20+1);
			for(int i = 1 ; i<5 ; i++){
				do {
					repeat = 0;
					array1[i]=(int)(Math.random()*20+1);
					for(int j = 0 ; j < i ; j++ ){
						if(array1[j]==array1[i]){ repeat++ ;}
					}
				}while(repeat != 0);
			}
		}
		
		if(number1 == 1){
			do {
				System.out.print("�п�J���Ӥj�ֳz���X�åH�Ů�j�} :");
				String string1 = input.nextLine();
			
				String[] array10 = string1.split(" ");
				
				for(int i = 0 ; i < 5 ;i++) {
					array1[i] = Integer.valueOf(array10[i]);}
				
				repeat = 0;  over = 0;
				
				for(int i = 0 ; i < 5 ;i++) {
					if( array1[i] > 20 || array1[i] < 1 ){over ++ ;}
				}
				
				for(int i = 0 ; i < 5 ;i++) {
					for(int j = 0 ; j < i ; j++ ){if(array1[j]==array1[i]){ repeat++ ;}}
				}
				
				if(repeat != 0 && over != 0){System.out.println("�W�X�d��B���ƼƦr�Э��s��J");}
				if(repeat != 0 && over == 0){System.out.println("���ƼƦr�Э��s��J");}
				if(repeat == 0 && over != 0){System.out.println("�W�X�d��Э��s��J");}
			}while(repeat != 0 || over != 0);
		}
		
		array2[0] = (int)(Math.random()*20+1);
		for(int i = 1 ; i<5 ; i++){
			do {
				repeat = 0;
				array2[i]=(int)(Math.random()*20+1);
				for(int j = 0 ; j < i ; j++ ){
					if(array2[j]==array2[i]){ repeat++ ;}
						}
			}while(repeat !=0);
		}
		
		System.out.print("\n�z�����X��:");
		for (int s : array1) {System.out.print(s+" ");}
		System.out.print("\n�}�������X��:");
		for (int s : array2) {System.out.print(s+" ");}
		
		for(int i = 0 ; i < 5 ; i++ ){
			for(int j = 0 ; j < 5 ; j++ ){
				if(array1[i] == array2[j])repeat0++;
			}
		}

		 switch (repeat0) {
	     case 5:
	 		System.out.print("\n���ߧA���Y��"); 
	        break;
	     case 4:
	 		System.out.print("\n���ߧA���L��"); 
	        break;	     
	     case 3:
	    	System.out.print("\n���ߧA���Ѽ�"); 
		    break;	     
		 case 2:
			System.out.print("\n���ߧA���v��"); 
			break;	     
		 default:
	 		System.out.print("\n���¦b�s��"); 
	        break;
	  }
	}
}

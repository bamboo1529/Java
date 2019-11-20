import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer =(int)(Math.random()*100+1);
		int up = 100;
		int down = 0;
		int in = 0;
		Scanner input = new Scanner(System.in);

		//System.out.printf("%d\n",answer);

		while(in != answer) {
		System.out.printf("請輸入%d~%d的整數:",down,up);
		in = input.nextInt();
		if(in <= up && in >= down)
			if(in >= down && in <= answer)
				down = in;
			else
				up = in ;
		else
			System.out.print("超出範圍,請重新輸入\n");
		};
		System.out.printf("恭喜你答對了,正確答案是:%d", answer );
	}

}

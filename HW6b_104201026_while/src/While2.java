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
		System.out.printf("�п�J%d~%d�����:",down,up);
		in = input.nextInt();
		if(in <= up && in >= down)
			if(in >= down && in <= answer)
				down = in;
			else
				up = in ;
		else
			System.out.print("�W�X�d��,�Э��s��J\n");
		};
		System.out.printf("���ߧA����F,���T���׬O:%d", answer );
	}

}

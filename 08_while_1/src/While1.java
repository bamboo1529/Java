import java.util.Scanner;
import javax.swing.JOptionPane;

public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		String dust0 = JOptionPane.showInputDialog("How many stardust do you have?");
		int dust = Integer.valueOf(dust0);

		String cost0 = JOptionPane.showInputDialog("How many stardust will consume when you powerup this pokemon?");
		int cost = Integer.valueOf(cost0);

		int time = dust/cost;
		
		while( dust >= cost )
		{	
		dust = dust - cost ;	
		String message = String.format("You still have %d stardust",dust);
		JOptionPane.showMessageDialog(null,message);
		}

		String message1 = String.format("You can powerup this pokemon for %d times" , time );
		JOptionPane.showMessageDialog(null,message1);


	}

}

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JOptionPane1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String name = JOptionPane.showInputDialog("What's your name?");

		String number = JOptionPane.showInputDialog("What's your shoes size?");
		int numder0 = Integer.valueOf(number);

		if( name.equals("John") && numder0 == 8)
		JOptionPane.showMessageDialog(null,"I found you!!!");
		else if( name.equals("John") || numder0 == 8)
		JOptionPane.showMessageDialog(null,"Sorry,you're not.");
		else
		JOptionPane.showMessageDialog(null,"Bye.");
		
	}

}

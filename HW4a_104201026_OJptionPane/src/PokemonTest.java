import javax.swing.JOptionPane;

public class PokemonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokemon myPokemon = new Pokemon(0);
		
		String name = JOptionPane.showInputDialog("What pokemon do you get?");
		myPokemon.setName(name);
		
		String dust0 = JOptionPane.showInputDialog("How many stardust will consume when you powerup this pokemon?");
		int dust = Integer.parseInt(dust0);
		myPokemon.setdust(dust);
		
		
		if (myPokemon.getdust() < 800 ) {
			String message1 = String.format( "%s is a small pokemon" , myPokemon.getName() ) ;
			JOptionPane.showMessageDialog( null , message1 ) ; }
		
		else if (myPokemon.getdust() == 800 ) {
			String message2 = String.format( "%s is a medium pokemon" , myPokemon.getName() ) ;
			JOptionPane.showMessageDialog( null , message2 ) ; }
		
		else {
			String message3 = String.format( "%s is a big pokemon" , myPokemon.getName() ) ;
			JOptionPane.showMessageDialog( null , message3 ) ; }
		
		
		
	}

}

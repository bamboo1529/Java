
public class Pokemon {
	
	private String name;
	private int dust;

	public Pokemon( int initdust ) { this.dust = initdust ;}
	
	public void setName( String name) {this.name = name;}
	public String getName() { return this.name ; }
	
	public void setdust( int d ) { this.dust = d ; }
	public int getdust() { return this.dust ; }

}


public class Room {

	private int number = 0;
	private double total = 0;
	
	public void setnumber( int n ) { this.number = n ; }
	public int getnumber() { return this.number ;} 
	

	public double calculate(int days){
		total = 1500*days;
		return total;	}
	
	public double calculate(int days,int people){
		total = 1500*days+(people-1)*500*days;
		return total;	}
	
	public double calculate(int days,int people,boolean breakfast){
		if(breakfast == true) {total = 1500*days+(people-1)*500*days+people*days*100;}
		else total = 1500*days+(people-1)*500*days;
		return total;	}
	
	public double calculate(int days,int people,boolean breakfast,boolean cash){
		if(breakfast == true) {if(cash == false) {total = (1500*days+(people-1)*500*days+people*days*100)*1.1;}
							   else {total = 1500*days+(people-1)*500*days+people*days*100;}}
		else {if(cash == false) {total = (1500*days+(people-1)*500*days)*1.1;}
			  else{total = 1500*days+(people-1)*500*days;}}		
		return total;	}

}

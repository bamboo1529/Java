
public class Findmin {
	static int number1;
	static int number2;
	static int number3;

	static int min;
	
	public void setnumber1( int a ) { number1 = a ; }
	public void setnumber2( int b ) { number2 = b ; }
	public void setnumber3( int c ) { number3 = c ; }
	

	public static int min() {
		if(number1 < number2 && number1 < number3)
			min = number1;
		if(number2 < number1 && number2 < number3)
			min = number2;
		if(number3 < number2 && number3 < number1)
			min = number3;
		return min;
		}
}

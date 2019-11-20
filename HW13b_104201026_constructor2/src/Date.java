
public class Date {

	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) throws Exception  {
		if( month>12 || month < 1  ) {throw new Exception("month wrong");}
		if( day>31 || day < 1 ) {throw new Exception("day wrong");}
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String toString() {
		return String.format("%d/%d/%d", month, day, year);
	}
}

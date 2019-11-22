
public class Animal {
	
	private String name;
	private String gender;
	private String age;
	private Date inday;
	
	public void setname(String name) {this.name = name;}
	
	public void setgender(String gender) {this.gender = gender;}
	
	public void setage(String age) {this.age = age;}
	
	public void setdate(Date inday) {this.inday = inday;}
	
	public String toString() {return String.format("%s\t%s\t%s\t%s",name,gender,age,inday);}
	
}

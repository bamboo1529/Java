
public class HotelGuide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to CJ Hotel! Let me show you our hotel:\n");
		
		Fitness room1 = new Fitness();
		SwimmingPool room2 = new SwimmingPool();
		Lobby room3 = new Lobby();
		
		room1.show();
		room2.show();
		room3.show();
	}

}

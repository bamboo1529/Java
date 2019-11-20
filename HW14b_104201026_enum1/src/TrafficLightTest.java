
public class TrafficLightTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TrafficLight thing = TrafficLight.Green;

		for (int i = 0; i <= 3; i++) {
			System.out.println(thing);
			if (i < 3) {
				for (int j = 10; j >= 1; j--) {
					System.out.println(j);
					Thread.sleep(1000);
				}
			}
			thing = change(thing);
		}

	}

	public static TrafficLight change(TrafficLight t) {
		switch (t) {
		case Green:
			return TrafficLight.Yellow;
		case Yellow:
			return TrafficLight.Red;
		case Red:
			return TrafficLight.Green;
		default:
			return null;
		}

	}

}

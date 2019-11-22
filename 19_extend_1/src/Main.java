
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rabbit r = new Rabbit("Judy");
		Fox f = new Fox("Nick");
		Sheep s = new Sheep("Dawn");
		Lion l = new Lion("Leodore");

		System.out.printf("Hi, %s %s\n", r, r.getName());
		System.out.printf("Hi, %s %s\n", f, f.getName());
		System.out.printf("Hi, %s %s\n", s, s.getName());
		System.out.printf("Hi, %s %s\n", l, l.getName());

		System.out.println();
		r.sleep();
		f.sleep();
		s.eat();
		l.eat();

		System.out.println();
		r.move();
		f.move();
		s.move();
		l.move();

	}

}

package decorator;

public class Main {

	public static void main(String[] args) {
		Source s = new Source();
		Decorator d = new Decorator(s);
		d.method();
	}
}

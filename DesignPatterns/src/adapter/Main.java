package adapter;

public class Main {

	public static void main(String[] args) {
//		Target target = new Adapter();
//		target.method1();
//		target.method2();
		
//		Source source = new Source();
//		Target wrap = new Wrapper(source);
//		wrap.method1();
//		wrap.method2();
	
		Target sub1 = new TargetSub1();
		sub1.method1();
		sub1.method2();
		Target sub2 = new TargetSub2();
		sub2.method1();
		sub2.method2();
	}
}

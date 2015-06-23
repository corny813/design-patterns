package bridge;

class SourceSub1 implements Sourceable{

	@Override
	public void method() {
		System.out.println("this is sub1");
	}
	
	public void sub1(){
		System.out.println("sub1");
	}
}

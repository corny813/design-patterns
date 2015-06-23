package facade;

/**
 * CPU/Memory放在Computer里
 * 
 * 外观模式：java.lang.Class
 * @author corny
 *
 */
public class Computer {

	private CPU cpu;
	private Memory memory;
	
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
	}
	
	public void start(){
		System.out.println("start computer");
		cpu.startCpu();
		memory.startMemory();
	}
	
	public static void main(String[] args) {
		Computer com = new Computer();
		com.start();
		
//		Class c;
	}
}

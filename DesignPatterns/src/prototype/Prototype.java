package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式：将一个对象作为原型，克隆、复制产生一个新的对象
 * @author corny
 *
 */
public class Prototype implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;
	private int num = 10;
	private String str = "hello prototype";
	private SerializableObject object;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public SerializableObject getObject() {
		return object;
	}

	public void setObject(SerializableObject object) {
		this.object = object;
	}

	//浅复制：对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象.
	public Object clone(){
		try {
			Prototype proto = (Prototype) super.clone();
			return proto;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public Object deepClone(){
		
		try {
			//流式写入对象
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			//流式读对象
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			Prototype proto = (Prototype)ois.readObject();
			return proto;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) {
		Prototype p = new Prototype();
		Prototype p1 = p;
		System.out.println((p1==p)+","+(p1.equals(p)));
		
		SerializableObject sObj = p.new SerializableObject();
		p.setObject(sObj);
		
		Prototype c1 = (Prototype) p.clone();
		SerializableObject obj = c1.getObject();
		int num = c1.getNum();
		String str = c1.getStr();
		//基本类型、String类型、对象类型是否== （String为同一引用则==为true）
		System.out.println((p.getNum()==num)+","+(p.getStr()==str)+","+(p.getObject()==obj));
		
		Prototype c2 = (Prototype) p.deepClone();
		num = c2.getNum();
		str = c2.getStr();
		obj = c2.getObject();
		//基本类型、String类型、对象类型是否== （String为两份引用则==为false）
		System.out.println((p.getNum()==num)+","+(p.getStr()==str)+","+(p.getStr().equals(str))+","+(p.getObject()==obj));

		System.out.println((p==c1)+","+(p==c2)+";"+(p.equals(c1)+","+(p.equals(c2))));
	}
	
	private class SerializableObject implements Serializable{
		private static final long serialVersionUID = 1L;
	}
}



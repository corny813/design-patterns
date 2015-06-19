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
	
	public class SerializableObject implements Serializable{
		private static final long serialVersionUID = 1L;
	}
}



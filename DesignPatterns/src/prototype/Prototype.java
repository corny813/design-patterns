package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * ԭ��ģʽ����һ��������Ϊԭ�ͣ���¡�����Ʋ���һ���µĶ���
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

	//ǳ���ƣ���ֵ���͵ĳ�Ա��������ֵ�ĸ���,���������͵ĳ�Ա����ֻ��������,���������õĶ���.
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
			//��ʽд�����
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);
			
			//��ʽ������
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



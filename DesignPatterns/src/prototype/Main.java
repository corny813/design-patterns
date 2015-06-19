package prototype;

import prototype.Prototype.SerializableObject;

public class Main {

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
		//�������͡�String���͡����������Ƿ�== ��StringΪͬһ������==Ϊtrue��
		System.out.println((p.getNum()==num)+","+(p.getStr()==str)+","+(p.getObject()==obj));
		
		Prototype c2 = (Prototype) p.deepClone();
		num = c2.getNum();
		str = c2.getStr();
		obj = c2.getObject();
		//�������͡�String���͡����������Ƿ�== ��StringΪ����������==Ϊfalse��
		System.out.println((p.getNum()==num)+","+(p.getStr()==str)+","+(p.getStr().equals(str))+","+(p.getObject()==obj));

		System.out.println((p==c1)+","+(p==c2)+";"+(p.equals(c1)+","+(p.equals(c2))));
	}
}

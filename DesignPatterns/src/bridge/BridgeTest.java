package bridge;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * sub1/sub2�������ɱ任����ʵ��sourceable�ӿ�
 * ���磺JDBC
 * @author corny
 *
 */
public class BridgeTest {

	public static void main(String[] args) {
		SourceSub1 sub1 = new SourceSub1();
		SourceSub2 sub2 = new SourceSub2();
		
		MyBridge bridge = new MyBridge();
		bridge.setSourceable(sub1);
		bridge.method();
		
		bridge.setSourceable(sub2);
		bridge.method();
		
//		try {
			//��������
//			Class.forName("");
			//��������
//			DriverManager.getConnection("");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}

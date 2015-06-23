package bridge;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * sub1/sub2可以自由变换，都实现sourceable接口
 * 例如：JDBC
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
			//加载驱动
//			Class.forName("");
			//创建连接
//			DriverManager.getConnection("");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}

package adapter;

/**
 * ���������ģʽ����һ����ת����������һ���ӿڵ���
 * target�ӿ��к���method1,method2; ��Ϊsource��ͬ������method1�����Կ��Բ���дmethod1
 * @author corny
 *
 */
public class Adapter extends Source implements Target{

	@Override
	public void method2() {
		System.out.println("method 2");
	}
}

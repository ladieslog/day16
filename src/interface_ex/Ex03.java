package interface_ex;

interface Test{
	public static final int a =12345;
	public final int a1=12345;
	public static int a2=12345;
	public static final String id="홍길동";
	public static final String pwd="12345";
}
class Test01 implements Test{
	public void test() {
		System.out.println(" 값");
	}
}

public class Ex03 implements Test {
	public static void main(String[] args) {
		System.out.println(Test.id);
		System.out.println(pwd);
	}
}

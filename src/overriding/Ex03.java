package overriding;

class A01{
	public void getText() {
		System.out.println("A 클래스");
	}
}
class B01 extends A01{
	public void getText() {
		System.out.println("B 클래스");
	}
}
class C01 extends A01{
	public void getText() {
		System.out.println("C 클래스");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		B01 b=new B01();
		C01 c =new C01();
		b.getText(); c.getText();
		
		A01 a =new B01(); //업캐스팅
		a.getText();
		a=new C01();
		a.getText();
		a=new A01();
		a.getText();
		
	}
}









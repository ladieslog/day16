package overriding;

abstract class Abstract{
	protected int num;
	public void setNum(int num) {
		this.num =num;
	}
	public void combo() {
		System.out.println(num+" 단 콤보 공격 ");
	}
}
class NewAbstract extends Abstract{
	public void combo() {
		System.out.println(num+" 단 콤보 공겨 & 2대 더 때리기");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		Abstract a =new NewAbstract();
		a.setNum(3);
		a.combo();
	}
}

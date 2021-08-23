package overriding;

import java.util.ArrayList;

class AA extends ArrayList{
	public void aa() {
		System.out.println("나만의 기능입니다."); 
	}
	public Object get(int modCount) {
		return super.get(modCount);
	}	
	public boolean add(Object o) {
		System.out.println("추가하는 기능 입니다. ");
		return true;
	}
}

class BB {
	public void bb() {
		System.out.println("bb의 기능입니다.");
	}	
}

public class Ex02 {
	public static void main(String[] args) {
		AA a=new AA();
		ArrayList arr =new ArrayList();
		String s; 
		a.add("안녕하세요");
		System.out.println("저장값 : "+a.get(0));		
	}
}

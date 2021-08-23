package interface_ex;

import java.util.Scanner;

class B_army implements A_room{
	public void offence() {
		System.out.println("지상군이 공격합니다.");
	}
	public void defense() {
		System.out.println("지상군이 방어합니다.");
	}
}
class B_air implements A_room{
	public void offence() {
		System.out.println("공군이 공격합니다.");
	}
	public void defense() {
		System.out.println("공군이 방어합니다.");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		//B_army am= new B_army();
		//B_air  air =new B_air();
		A_room ar=null;
		System.out.println("적이 처들어 왔습니다.");
		System.out.println("1. 지상군 2.공군");
		int choice=0;
		Scanner input =new Scanner(System.in);
		int num =input.nextInt();
		
		if(num==1) {
			System.out.println("지상군 선택");
			ar=new B_army();
		}
		else {
			System.out.println("공군 선택");
			ar=new B_air();
		}
		
		System.out.println("1.공격 2.방어");
		choice =input.nextInt();
		if(choice==1) ar.offence();
		else ar.defense();
		
		/*
		if(choice ==1 && num==1) am.offence();
		else if(choice==2 &&num==1) am.defense();
		else if(choice==1 &&num==2) air.offence();
		else if(choice==2 &&num==2) air.defense();*/
		
	}
}

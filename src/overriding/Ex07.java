package overriding;

class a_army{
	public void offence() {
		System.out.println("지상군이 공격합니다.");
	}
	public void defence() {
		System.out.println("지상군이 방어합니다.");
	}
}
class a_air{
	public void aircraft() {
		System.out.println("비행기미사일 발사합니다.");
	}
	public void avoid() {
		System.out.println("유도탄을 써서 우회합니다.");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		a_army army = new a_army();
		a_air airForce =new a_air();
		army.offence(); army.defence();
		airForce.aircraft(); airForce.avoid();
	}
}

package overriding;

public class Ex01 {
	public static void main(String[] args) {
		Ferrari fe=new Ferrari(2021, 350);
		NewFerrari nfe =new NewFerrari(2022, 400);
		fe.speed();
		System.out.println("===");
		nfe.speed(); nfe.autoSystem();
	}
}


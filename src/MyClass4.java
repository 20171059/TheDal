import java.util.Random;
import java.util.Scanner;

public class MyClass4 {
	
	public int userDab () {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
	
	public int thehagi() {
		Random rnd = new Random();
		int num1 = rnd.nextInt(89) + 10;
		int num2 = rnd.nextInt(89) + 10;
		System.out.println(num1 + "+" + num2 + "=");
		return num1 + num2;
	}
	
	public int thehagi(int num1 , int num2) {
		return num1 + num2;
	}
	public boolean ox(int ha) {
		return false;
	}
	
}



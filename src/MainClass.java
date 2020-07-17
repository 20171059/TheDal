import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 클래스");
		
		MyClass mc =new MyClass();
		System.out.println(mc);
		mc.bab();
		mc.food();
		mc.nono();
		mc.home();
		MyClass2 mc2 = new MyClass2();
		mc2.m1();
		mc2.m2();
		
		MyClass mc1 = null;
		
		MyClass3 mc3 = new MyClass3();
		int i = mc3.r1();
		System.out.println("r1에서 받은 int 데이터: "+ i);
		String s = mc3.r2();
		System.out.println(s+"ㅇㅇ~");
		
		MyClass4 td = new MyClass4();
		int hab = td.thehagi();
		
		int input = td.userDab();
		if(hab == input) {
			System.out.println("맞다");
		}else {
			System.out.println("틀림");
		}
	}
}

package Addition;
import java.util.Scanner;

public class AddClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a = ob.nextInt();
		b = ob.nextInt();
		int c = a+b;
		System.out.println(c);

	}

}

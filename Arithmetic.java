import java.util.*;
public class Arithmetic{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		int result;
		result = num1 + num2;
		System.out.println("Adittion of "+num1+" and "+num2+" = " + result);
	}
}
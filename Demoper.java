import java.util.*;
public class Demoper{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();
		System.out.println("Enter Fourth Number");
		int num4 = sc.nextInt();
		System.out.println("Enter Fifth Number");
		int num5 = sc.nextInt();
		int result=((num1+num2+num3+num4+num5)*100)/500;
		switch(result){
			case "70<result<100":
				System.out.println("First Class");
			case "50<result<70":
				System.out.println("Second Class");
			case "result>35":
				System.out.println("Third Class");
			default:
				System.out.println("Fail");
		}
		


		
		
	}
}
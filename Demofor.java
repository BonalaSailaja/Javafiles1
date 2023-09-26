import java.util.*;
public class Demofor{
	public static void main(String s[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num = sc.nextInt();
		for(int i=0;i<num;i++){
			if(i%2==0){
				System.out.println(i+"is a Even");
			}
			else{
				System.out.println(i+"is a Odd");
			}
		}
		
	}
}
import java.util.Scanner;  
public class PrintTable   
{  
public static void main(String args[])  
{    
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
int num=sc.nextInt();  
System.out.print("Enter range: ");         
int range=sc.nextInt();  
int i = 0;     
do  
{   
System.out.println(num);  
 
i++; 
num=num+2;
} 
while (i <= range);
}  
}  

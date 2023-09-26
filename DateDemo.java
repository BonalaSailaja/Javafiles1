import java.util.*;
import java.text.*;
public classDateDemo{
	public static void main(String s[]){
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date:"+ft.format(dNow));
	}
}
import java.io.*;

public class LeapYear {

	public static void main(String[] args) throws Exception {
		
		BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(keybd.readLine());
		int remain100 = year % 100;
		int remain400 = year % 400;
		
		if(remain100 == 4) {
			System.out.println(year + " is a leap year.");
		}else if(remain400 == 0) {
			System.out.println(year + " is a leap year.");
		}else {
			System.out.println(year + " is not a leap year.");
		}
	}
		
		
		

}



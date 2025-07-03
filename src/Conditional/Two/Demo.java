package Conditional.Two;
import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter signal light:");
		String ip = sc.next();
			
		if(ip.equalsIgnoreCase("red") ||  ip.equalsIgnoreCase("green") || ip.equalsIgnoreCase("yellow") ) {
			
			TrafficSignal t = new TrafficSignal();
			String msg = t.signal(ip);
			System.out.println(msg);
		}
		else {
			System.out.println("User has given wrong input: "+ip);
		}
			
			sc.close();
		}
}



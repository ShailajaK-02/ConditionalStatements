package switchcase;
import java.util.Scanner;
public class switchcasemain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day in week :");
		String ip =sc.next();
		
		switch(ip) {
		
		case "monday":
			System.out.println("1");
			break;
		case "tuesday":
			System.out.println("2");
			break;
		case "wednesday":
			System.out.println("3");
			break;
		case "thurday":
			System.out.println("4");
			break;
		case "friday":
			System.out.println("5");
			break;	
		case "saturday":
			System.out.println("6");
			break;	
		case "sunday":
			System.out.println("7");
			break;
		default:
			System.out.println("Invalid");
		}
		sc.close();
	}
}

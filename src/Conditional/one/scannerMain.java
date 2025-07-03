package Conditional.one;
import java.util.Scanner;

public class scannerMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		
		int ip = sc.nextInt();
		
		condscanner s = new condscanner();
		String msg = s.isEven(ip);
		System.out.println(msg);
		
		sc.close();
	}

}

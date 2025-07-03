package Conditional.Two;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter document one: ");
		String ip1 = sc.next();
		
		System.out.println("Enter document 2: ");
		String ip2 = sc.next();
				
		practice p =  new practice();
		
		String op = p.pass(ip1, ip2);
		System.out.println("Status for passport : " + op);
		
		sc.close();

	}

}

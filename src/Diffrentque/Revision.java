package Diffrentque;

public class Revision {
		
	static {
		System.out.println("A");
	}
	
	public Revision() {
		
		System.out.println("Constructor");
	}
	
	static {
		
		System.out.println("B");
	}
	
	public void main() {
		System.out.println("Main method");
	}
}

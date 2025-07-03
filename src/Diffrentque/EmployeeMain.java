package Diffrentque;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		Employee E = new Employee();
		E.id = 101;
		E.surname="siya";
		E.surname ="patil";
		
		Employee E2= new Employee();
		E2.id = 103;
		E2.name ="ishu";
		E2.surname ="Kshirsagar";
		
		System.out.println(E.id);
		System.out.println(E2);
	}
}

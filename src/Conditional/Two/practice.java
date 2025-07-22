package Conditional.Two;
//// if person have both adhar and pan then he is eligible
//for passport otherwise not 
//if sequence of document change it should not change the output?
public class practice {

	public String pass(String doc1 , String doc2) {
		
		if(doc1.equalsIgnoreCase("AADHAR") && doc2.equalsIgnoreCase("PAN") || doc1.equalsIgnoreCase("PAN") && doc2.equalsIgnoreCase("AADHAR")){
			
			return "You are eligible for pssport";
		}else {
			return "Not eligible";
		}
		
	}
}

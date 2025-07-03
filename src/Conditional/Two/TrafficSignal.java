package Conditional.Two;

public class TrafficSignal {
	
	public String signal(String sig) {
		
		if(sig.equalsIgnoreCase("red")) {
			return "You should stop";
		} else if(sig.equalsIgnoreCase("green")) {
			return "You can go";
		}else if(sig.equalsIgnoreCase("yellow")) {
			return "Go slow";
		}else {
			return "Invalid signal";
		}
	
	}
}


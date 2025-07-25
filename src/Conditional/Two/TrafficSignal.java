package Conditional.Two;

public class TrafficSignal {
	
	public String signal(String sig) {
		//red -> stop , green-> go , yellow->slow
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


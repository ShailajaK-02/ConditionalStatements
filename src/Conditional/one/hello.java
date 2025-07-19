package Conditional.one;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class hello{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Predicate<Integer> pred = a-> a%2 == 0;
		System.out.println(pred.test(11));
		
		Function<Integer,Integer> fun = a -> a*a;
		System.out.println(fun.apply(2));
		
		Consumer<Integer> con = a -> System.out.println(a);
		con.accept(2);
		
		Supplier<String> sup = () -> "Supplier";
		System.out.println(sup.get());
		
		
	
		
	}

}

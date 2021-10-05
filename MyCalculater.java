package PreDefinedFunction;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


import defaultandStaticMethod.Dog;
import defaultandStaticMethod.Dog.DogAction;

public class MyCalculater {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In Consumer Interface : ");
		System.out.println("Enter any  values");
		Consumer c = (x) -> {System.out.println(x);};
		c.accept(sc.next());
		
		
		System.out.println("In Predicate Interface : Check Number is Even or not ");
		System.out.println("Enter any  values");
		Predicate<Integer> p = (x) -> x % 2 == 0;
		System.out.println(p.test(sc.nextInt()));
		
		
		System.out.println("In Function Interface: Check No is > 100 or No");
		System.out.println("Enter value");
		Function<Integer,Boolean> f = (x) -> x >= 100;
		System.out.println(f.apply(sc.nextInt()));
		
	}

}

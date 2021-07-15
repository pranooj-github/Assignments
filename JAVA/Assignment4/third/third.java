package thirdque;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class third {
	public static void main(String args[]) {
		Predicate<Integer> predicate=(i)-> i>5;
		System.out.println(predicate.test(10));
		Consumer <String> consumer= s -> System.out.println(s);
		consumer.accept("helloWorld");
		Supplier <String> supplier=()->"hai";
		System.out.println(supplier.get());
		Function <String,Integer> function=s->s.length();
		System.out.println(function.apply("namaskar"));
	}

}

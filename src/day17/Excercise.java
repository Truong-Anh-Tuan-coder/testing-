package day17;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Excercise {
	public static void main(String[] args){
		Consumer<Integer> consumer = t ->System.out.println("printing : " + t);
		consumer.accept( 10 );

		List<Integer> list = Arrays.asList(1, 2, 3, 4);

		list.stream()
				.forEach(element -> System.out.println(element));
	}
}

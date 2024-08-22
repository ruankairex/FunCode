package lambda_learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

record Person(String name, Integer age) {}

public class MethodReferenceDemo {
	static <P,R> List<R> map(List<P> list, Function<P,R> mapper){
		List<R> mapped = new ArrayList<R>();
		for(int i=0; i<list.size(); i++) {
			mapped.add(mapper.apply(list.get(i)));
		}
		return mapped;
	}
	
	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Sann","max","john","Ruan");
//		List<Person> persons = map(names,Person::new);
//		persons.forEach(System.out::println);
		
		// 假設名字和年齡用逗號分隔
        List<String> names = Arrays.asList("Sann,25", "max,30", "john,35", "Ruan,40");
        
        Function<String, Person> trans = stringValue -> {
        	String[] processedData = stringValue.split(",");
        	Person res = new Person(processedData[0],Integer.parseInt(processedData[1]));
			return res;
        };
        
        List<Person> person = map(names,trans);
        person.forEach(System.out::println);
	}
}

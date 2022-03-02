package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,10,15,20,25,30,35);
		
		//filtering without streams
		
		 List<Integer> evenList = new ArrayList<>();
		for(Integer in :list) {
			if(in %2 == 0) {
				evenList.add(in);
			}
		}
		
		System.out.println(evenList);
		
		//filtering with streams
		
		List<Integer> streamEvenList = new ArrayList<>();
		
		evenList.stream()
			.filter(a -> a % 2 == 0)
			.forEach( System.out :: println );
		
		
	}
	
}

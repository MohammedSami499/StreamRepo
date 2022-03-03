package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Streams {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("sami" , "ahmed"  , "ali" , "ibrahim" , "mohammed" , "ayman");
		
		//filtering without streams
		
		 List<String> strings = new ArrayList<>();
		for(String in :list) {
			if(in != null) {
				strings.add(in);
			}
		}
		
		
		//filtering with streams
		
		List<Integer> streamEvenList = new ArrayList<>();
		
		
		 list.stream().map(name -> name.length()).forEach(System.out:: println);


		
	}
	
}

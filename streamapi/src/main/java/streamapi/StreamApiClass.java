package streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiClass {

	
	public  Map<String, List<String>> groupBy(Map <String, String> input) {
		
		HashMap<String, String> a = new HashMap<String, String>(input);
		
		
		 Map<String, List<String>> result =  a.entrySet().stream().collect(
				 Collectors.groupingBy(
		            Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList()))
				 );
		    
		    
		    return result;
	}
}

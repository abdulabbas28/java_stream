package streamapi;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;



public class StreamApiClassTest {

	@Test
	public void test() {

	Map<String, String> playerByCountry = new HashMap<String, String>();
		
		playerByCountry.put("Dhoni","Ind");
		playerByCountry.put("Kholi","Ind");
		playerByCountry.put("Bumrah","Ind");
		playerByCountry.put("Ponting","Aus");
		playerByCountry.put("Bradman","Aus");
		playerByCountry.put("Ali","Eng");
		playerByCountry.put("Atherton","Eng");
		Map<String, List<String>> result = new StreamApiClass().groupBy(playerByCountry) ;
		
		System.out.println(result);
		
		
		List<String> out = result.entrySet().stream().filter(v-> v.getKey().equals("Aus")).
				map(s->  s.getValue()).flatMap(List::stream).collect(Collectors.toList());

		
		assertEquals(2, out.size());
		
	}

}

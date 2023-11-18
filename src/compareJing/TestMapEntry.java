package compareJing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
	    map.put("1", 8);
	    map.put("2", 12);
	    map.put("3", 53);
	    map.put("4", 33);
	    map.put("5", 11);
	    map.put("6", 3);
	    map.put("7", 3);
	    List<Map.Entry<String,Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
	    Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
	    System.out.println(list.get(0).getKey());
	}

}

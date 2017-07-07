package algorithms;

import java.util.HashMap;

public class LogSystem {	
	private HashMap<String, Integer> store = new HashMap<String, Integer>();

	public void put(int id, String timestamp) {
		store.put(timestamp, id);
	}

	
}

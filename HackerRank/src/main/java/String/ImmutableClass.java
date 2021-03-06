package String;

import java.util.HashMap;
import java.util.Iterator;

public final class ImmutableClass {

	private final int id;
	private final String name;

	private final HashMap<String, String> mymap;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap<String, String> getMymap() {
		return (HashMap<String, String>) mymap.clone();
	}

	public ImmutableClass(int id, String name, HashMap<String, String> map) {
		super();
		System.out.println("Performing Deep Copy for Object initialization");
		this.id = id;
		this.name = name;
		HashMap<String, String> mymap = new HashMap<String, String>();
		Iterator<String> keySet = map.keySet().iterator();
		while (keySet.hasNext()) {
			mymap.put(keySet.next(), mymap.get(keySet.next()));
		}
		this.mymap = mymap;
	}

}

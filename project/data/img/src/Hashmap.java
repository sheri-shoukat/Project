import java.util.HashMap;

public class Hashmap {

	// Main driver method
	public static void main(String[] args)
	{
		
		HashMap<String, Integer> map = new HashMap<>();

		map.put("Kevin", 10);
		map.put("Lyon", 30);
		map.put("Sara", 20);

		System.out.println("Size of map is= "
						+ map.size());

		// Printing elements in object of Map
		System.out.println(map);


		if (map.containsKey("Kevin")) {

			// Mapping
			Integer a = map.get("Kevin");

			// Printing value fr the corresponding key
			System.out.println("value for key"
							+ " \"Kevin\" is= " + a);
		}
	}
}

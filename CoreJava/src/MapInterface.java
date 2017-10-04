import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer,String> address=new TreeMap<Integer,String>();
		address.put(101, "Ethiopia");
		address.put(102, "Kenya");
		address.put(103, "Sudan");
		address.put(106, "Djibouti");
		address.put(105, "South Africa");
		
		//System.out.println(2306996%15);
		
		
		
		for(Map.Entry<Integer, String> m: address.entrySet()){
			System.out.println(m.getKey()+" ==>> "+m.getValue());
		}
		

	}

}

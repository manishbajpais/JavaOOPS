import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class DupElement {
	public static void main(String []args) {
		String names[] = {"java","C","Java","Dot Net","Python", "C","java","Python"};
		for(int i =0;i<names.length;i++) {
			for(int j = i+1; j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element is: "+names[i]);
				}
			}
		}
		System.out.println("*****************");
		
		//2. solution using hashset(part of java collection)
		// hashset stores unique values
		Set<String> store = new HashSet<String>();
		for(String name: names) {
			if(store.add(name)  == false) {
				System.out.println("duplicate value is "+name);
				
			}
		}
		System.out.println("*****************");
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		for(String name: names) {
			Integer count = m1.get(name);
			if(count==null) {
				m1.put(name, 1);
				System.out.println(m1);
			} else {
				m1.put(name, ++count);
			}
		}
		
		
		
	}

}

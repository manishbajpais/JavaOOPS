package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept<E> {
	//Array list is dynamic array
	//int a[] = new int[3] ==> static array
	public static void main(String []args) {
		ArrayList ar = new ArrayList();
		ar.add(19);
		ar.add(20);
		ar.add(30);
		System.out.println(ar);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(30);
		ar.add("This");
		System.out.println(ar);
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		System.out.println(ar.set(2, 50));
		System.out.println(ar);
		//to print/retrive all the values of arraylist we'll use for loop
		for(int i=0;i<ar.size();i++) {
			System.out.println(" "+ar.get(i));
		} 
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(20);
		ar1.add(5);
		System.out.println(ar);
		
		ArrayList<String> ar2 = new ArrayList<String>() ;
		ar2.add("Manish");
		ar2.add("Somya");
		ar2.add("Anurag");
		ar2.add("Vandana");
		ar2.add("Shreyansh");
		ar2.add("Ansh");
		System.out.println(ar2);
		System.out.println(ar2.size());
		
		
		Employee e1 = new Employee("manish", 32, "IT");
		Employee e2 = new Employee("Anurag", 39, "BA");
		Employee e3 = new Employee("Bhagwan", 33, "ENG");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name+"\n");
			System.out.println(emp.age+"\n");
			System.out.println(emp.dept+"\n");
			
		}
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Java");
		ar5.add("C++");
		ar5.add("Python");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Basic");
		ar6.add("Android");
		ar6.add("IOS");
		ar5.addAll(ar6);
		System.out.println(ar5);
		ar5.removeAll(ar6);
		System.out.println(ar5);
		
		
	} 
	
}

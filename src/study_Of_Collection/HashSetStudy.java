package study_Of_Collection;

import java.util.HashSet;

public class HashSetStudy {

	public static void main(String[] args) 
	{
		
		
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add(123);
		hs.add(67.87);
		hs.add(true);
		hs.add("Pune");
		hs.add(null);
		hs.add("Mumbai");
		hs.add(false);
		hs.add("Pune");
		hs.add(null);
		System.out.println(hs);
		
		
		for(Object HS:hs) 
		{
			System.out.println(HS);
		}
		
		
		//Iteartor
	

	}

}

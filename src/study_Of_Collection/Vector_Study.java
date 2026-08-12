package study_Of_Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Study {

	public static void main(String[] args) {


		
		Vector<Object> vt = new Vector<Object>();
		
		
		
		vt.add("Pune");
		
		vt.add(34.89);
		vt.add(null);
		vt.add("Pune");
		vt.add('V');
		
		System.out.println(vt.elementAt(3));
		
		
		//for
		//for each
		//iterator
		//listiterator
		//enumeration
		
		
		Enumeration<Object> enu = vt.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}

	}

}

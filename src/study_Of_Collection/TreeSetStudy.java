package study_Of_Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<Object>();
		
		ts.add(123);
		ts.add(890);
		ts.add(23);
		ts.add(78);
		ts.add(90);
		
		System.out.println(ts);
		
		System.out.println(ts.ceiling(91));
		NavigableSet<Object> st = ts.descendingSet();
		System.out.println(st);
		
		System.out.println(ts.floor(1000));
		
		
		
	}

}

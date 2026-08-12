package study_Of_Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_Study {

	public static void main(String[] args) 
	{
		
//		ArrayList<String> al = new ArrayList<String>();
//		
//		ArrayList<Integer> al1 = new ArrayList<Integer>();
//		
//		ArrayList<Character> al2 = new ArrayList<Character>();
		
		ArrayList<Object> al = new ArrayList<Object>();
		
		al.add(123);
		al.add("Pune");
		al.add("Mumbai");
		al.add(67.89);
		al.add(true);
		al.add("Pune");
		al.add(null);
		al.add('S');
		al.add(false);
		al.add(null);
		al.add("Mumbai");
		System.out.println(al);
		
		
		al.add("Chennai");
		System.out.println(al);
		al.add(5, null);
		System.out.println(al);
		al.addFirst(null);
		System.out.println(al);
		al.addLast(8907);
		System.out.println(al);
		
		//al.clear();
		//System.out.println(al);
		
		Object AL = al.clone();
		System.out.println(AL);
		
		
		System.out.println(al.contains("Pune"));
		System.out.println(al.get(9));
		
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		System.out.println(al.indexOf("Pune"));
		System.out.println(al.lastIndexOf("Pune"));
		
		al.remove(5);
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		al.remove("Pune");
		System.out.println(al.isEmpty());
		List<Object> tt = al.subList(3, 7);
		System.out.println(tt);
		System.out.println(al.size());
		al.set(5, "India");
		System.out.println(al);
		List<Object> rev = al.reversed();
		System.out.println(rev);
		
		
//		System.out.println(al.get(0));
//		System.out.println(al.get(1));
//		System.out.println(al.get(2));
//		System.out.println(al.get(3));
//		System.out.println(al.get(4));
		System.out.println("By For Loop");
		for(int i = 0 ; i<=al.size()-1;i++) 
		{
			System.out.println(al.get(i));
		}
		
		
		
		System.out.println("For Each Loop ");
		
		for(Object ll:al) 
		{
			System.out.println(ll);
		}
		
		//Iteartor
		System.out.println("By Iterator=================");
		
		Iterator<Object> it = al.iterator();
		
		while(it.hasNext()) 
		{
			System.out.println(it.next());
		}
		
		System.out.println("By ListIterator=================");
		
		ListIterator<Object> li = al.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}

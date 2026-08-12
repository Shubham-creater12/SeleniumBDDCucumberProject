package study_Of_Collection;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {

LinkedList<Object> li = new LinkedList<>();

li.add(123);
li.add(null);
li.add("India");
li.add("Mumbai");
li.add(null);
li.add(78.78);
li.add(true);
li.add("India");

System.out.println(li);

System.out.println(li.element());

li.offer("Mumbai");
System.out.println(li);
System.out.println(li.peekLast());
System.out.println(li.poll());

System.out.println(li);

System.out.println(li.pop());
System.out.println(li);

li.push(false);
System.out.println(li);

//for
//for each
//iterator
//listitaror
//
	}

}

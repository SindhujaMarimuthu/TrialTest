package Scuba.javatraining;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list= new ArrayList<>();
		list.add("Track A: API");
		list.add("TRACK B: Selenium");
		list.add("TRACK C: Digital");
		list.add("TRACK B: Selenium");
		for(String names:list)
		{
			System.out.println(names);
		}
		
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.remove(3));
		System.out.println(list.size());
	}

}
//ArrayList only forward direction 
//LinkedList will be forward and backward direction
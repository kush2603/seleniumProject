package collections_Examples;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();
		al.add("papaya");
		al.add("mango");
		al.add("apple");
		al.add("raspberry");
		al.add("orange");
		al.add("apple");
		al.add("apple");
		al.add("raspberry");
		al.add("raspberry");
		
		System.out.println(al);
		
		//remove duplicates from an arrayList'
		
		ArrayList<String> uniqueList = new ArrayList<>(new LinkedHashSet<>(al));
		System.out.println(uniqueList);
		
		
	}

}

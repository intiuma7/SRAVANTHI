package JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("uma");
		ar.add("nirvik");
		ar.add("amma");
		
		System.out.println(ar);
		
		Collections.sort(ar);
		System.out.println("size of arraylist  "+ar.size()+" and the array list is "+ar);
		
		Collections.shuffle(ar);
		System.out.println("size of arraylist  "+ar.size()+" and the array list is "+ar);
		
		Iterator ir= ar.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}

	}

}

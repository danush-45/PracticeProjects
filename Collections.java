package corejavaprogram;
import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();  
		list.add("APPLE");  
		list.add("BANANA");  
		list.add("CARROT");  
		list.add("DRUMSTICK");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
	}  
	
}

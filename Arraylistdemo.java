import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("krishnan");
		al.add("ashok");
		al.add("karthik");
		
	
	Iterator i = al.iterator();
	
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	
	
	i.remove();
	
	System.out.println(al);
		
	}

}

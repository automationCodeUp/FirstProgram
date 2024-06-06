import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hashmap2 {

	public static void main(String[] args) {
		  String str = "Java isap latformi111111end 000 666 entla bsbcascvgsvchgnguage";
		  Map<Character,Integer> duplicate = new HashMap<Character,Integer>();
		  char[] carray = str.toCharArray();
		  for (Character c:carray) {
		   if (c != ' ') {
		   if(duplicate.containsKey(c))
		   {
			   System.out.println("Duplciate is "+duplicate.get(c));
		    duplicate.put(c, duplicate.get(c)+1);
		   }
		   else {
		    duplicate.put(c, 1);
		        }
		  }
		  }
		  Set<Character> set = duplicate.keySet();
		  
		  for (Character c:set) {
		   if(duplicate.get(c)>1)
		     {
		    System.out.println(c+" "+duplicate.get(c));
		   }
		  }
		  // TODO Auto-generated method stub

		 }

		}


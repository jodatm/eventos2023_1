import java.util.*;

class App6{

	static boolean isUnique(String s)
	{
		HashSet<Character> set =new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		    {
				char c=s.charAt(i);
				if(c==' ')
					continue;
				if(set.add(c)==false)
					return false;
					
			}
			
		return true;
	}

    static void check(String s)
	{
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
			{char c=s.charAt(i);
			 if(!map.containsKey(c))
				map.put(c,1);
			 else
				map.put(c,map.get(c)+1);
			}
			
		
		
		Iterator<Character> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Object x=itr.next();
			System.out.println("count of "+x+" : "+map.get(x));
		}
	}
	
	
	public static void main(String[] args)
	{
		String s="helo wqty ";
		boolean ans=isUnique(s);
		if(ans)
			System.out.println("string has unique characters");
		else
			System.out.println("string does not have unique characters");

        String s2="hello";
        check(s2);
		
	}
}
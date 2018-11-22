package Assignment2;

public class Searching {
	public  int Search_String(String[] Dict, String Target)
	{
		int mid;
		int low=0,high=Dict.length-1;
		while(low<=high)
		{
			mid=(high+low)/2;
			if(Dict[mid].compareTo(Target)==0)
			{
				return 0;
			}
			else if(Dict[mid].compareTo(Target)<0)
			{
				low=mid+1;
			}
			else high=mid -1;

				
		}
		return -1;
	}
	public  int Compare_strs2(String s1, String s2)
	{
		int l1=s1.length();
		int i;
		int l2=s2.length();
		for( i=0;i<l1&&i<l2;i++)
		{
			if(s1.charAt(i)<s2.charAt(i))           //s1<s2 Indicates s1 comes lexicographically first
			return 1;
			
			else if(s1.charAt(i)>s2.charAt(i))      //s1>s2 Indicates s2 comes lexicographically first
			return -1;
		}
		if(l1==l2)                                  //l1=l2 and this comes after looping => both s1 and s2 are equal
		return 0;
		else if(l1<l2)                              //l1<l2  (Anu  && Anurag) indicates s2 is greater
			return 1;
		else return -1;                             //
	}

	
}

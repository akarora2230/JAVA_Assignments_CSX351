package Assignment2;

public class Sorting {

	
	public int Compare_strs(String s1, String s2)
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
		else if(l1<l2)                              //l1<l2  (Anu && Anurag) indicates s2 is greater
			return 1;
		else return -1;                             //finally return NOT EQUALL indicator if all cases fail.
	}
	
	public void Bubble_sort(String A[])            //function to sort an array of Strings.
	{
		int size_A=A.length;
		 for(int i=0;i<size_A;i++)
	       {
	    	   for(int j=i+1;j<size_A;j++)
	    	   {
	    		   if(Compare_strs(A[i],A[j])==-1)   //Swap if String Above is lexicographically greater than s2.
	    		   {
	    			   String  temp = A[i];
	    			   A[i]=A[j];
	    			   A[j]=temp;
	    			   
	    		   }
	    	   }
	       }
	}
	
}

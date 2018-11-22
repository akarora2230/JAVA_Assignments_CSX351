
/**
 * A class holding different recursive metholds to compute fibonacci numbers.
 * 0, 1, 1, 2, 3, 5, 8, ...
 * 
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveFibonacci
{


    /**
     * basic - The simple version of fibonacci.
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonacci number.
     */
    public long basic(long n)
    {
        long result = 1;
        
        if( n <= 0)
            result = 0;
        else if (n == 1)
            result = 1;
        else
            result = basic(n-1) + basic(n-2);
        
        return result;
    }
    
    
    /**
     * better - A better version of fibonacci. (Height Limited Double Recursion)
     * 
     * @param  n   A positive integer.
     * @return     The nth fibonacci number.
     */
    public long better(long n)
    {
        long result = 0;
        // IMPLEMENT THIS RECURSIVE METHOD
        
        if(n<0)
        	return -1;
        if(n==1)
        	result= 1;
        
        else if(n>1)
        {
        	if(n%2==0)
        	{
        	result=(long)Math.pow(better(n/2), 2) + (long)2*better(n/2)*better(n/2-1);	
        	}
        	else 
        	{
        		result= 2*(long)Math.pow(n/2, 2) + 2*(long)better(n)*better(n-1)+ (long)Math.pow(better(n-1),2);
        	}
        }
                
        return result;
    }


    /**
     * tailRecursive - A tail recursive version of fibonacci. 
     *              (Height limited, Two problems per level)
     * 
     * @param  n   A positive integer. 
     * @return     The nth fibonnaci number.
     */
    public long tailRecursive(long n)
    {
        // IMPLEMENT THIS METHOD USING A RECURSIVE HELPER FUNCTION
        // AND RETURN AN APPROPRIATE VALUE
         return 0;
    } 
    

    /**
     * secondMSB - Determine the value of the second most significant bit.
     * 
     * @param  n   A positive integer 
     * @return     True if the second most significant bit is 1, false otherwise.
     */    
    public boolean secondMSB(long n)
    {
        // IMPLEMENT THIS METHOD AND RETURN AN APPROPRIATE VALUE
    	
    	 if(((n>>62)&1)==1)
         	return true;
         else
          return false;
    	
    }


    /**
     * reduceBy2ndMSB - Reduce the number by removing the second most significant bit
     * from the representation.
     * 
     * @param  n   A positive integer > 1
     * @return     The integer value equivalent to removing the 2nd most significant bit
     *              from n.
     */    
    public long reduceBy2ndMSB(long n)
    {
        long result = 1;
        // IMPLEMENT THIS METHOD
        long count=1;
        while(n!=0)
        {
        	if(count ==63)
        		continue;
        	else 
        	{
        		result = result*2 + (n&1);
        		n=n>>1;
        	}
        }
        
        return result;
    }
    
    
}
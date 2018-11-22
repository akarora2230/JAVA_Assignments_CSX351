package Assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TheMain {

	public static void main(String[] args) throws IOException
	{
		
		
		   	BufferedReader inp1 = new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW3\\HW3-unsorted-keywords.txt"));
			BufferedReader inp2 = new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW3\\HW3-input-code.cpp"));
			
			String s="";
			
			//BR Object to output to the OUTPUT.txt
			BufferedWriter out1 = new BufferedWriter(new FileWriter("H:\\JAVA_ASSIGNMENTS\\HW3\\Output.txt"));  
			
			int lineNo=1;
			int indexNo=0,startIndex=0, atLeastOne=0;
			
			int count=0;
			
			//Step 1. Count the no of Words in file.
			while((s=inp1.readLine())!=null)                    
			count++;
			
			//Step 2. Create a String array of the Size counted in Step 1.
			String []Keyword= new String[count];               
			int i=0;
			count=0;
			BufferedReader ob2= new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW3\\HW3-unsorted-keywords.txt"));
			while((s=ob2.readLine())!=null)
			{
				 //Step 3. Re-read the file to enter keywords.
				Keyword[i]=s;                                 
				i++;
			}
			
			 //Object of Sort class created to Sort KEYWORDS Array.
			Sorting_LAB4 Sort = new Sorting_LAB4(); 
			
			//Step 4. KEYWORDS Sorted.
			Sort.Bubble_sort(Keyword);                         

			
			/******************************************KEYWORD SORTED UPTIL THIS POINT*************************************************************/
			
			String A = "";
			                                        
			 // Now reading from the CPP file.

		    while((s=inp2.readLine())!=null)                     
		  {
			startIndex = 0;
		    indexNo=0;
		    
			atLeastOne = -1;
			int flag=0;
			
			  // a single line is broken into meaningful tokens.
			for(int k=0;k < s.length();k++)                 
			{
				//Condition 1, Ignore the comments
				if(s.charAt(k)=='/' && s.charAt(k+1)=='/')
					{
                         					
					break;
					}
				
				// Creating a word from the file...a word can include <a to z> , <0-9> , and _.
				
				if((s.charAt(k)>=97 && s.charAt(k)<=122)||(s.charAt(k)>=48 && s.charAt(k)<= 57)||(s.charAt(k)=='_'))
					{
						A=A+s.charAt(k); 
					    
					}
				
				// Case when two Invalid Characters come together. Then Increment the position.
				
				else if(A=="" || A==" ")
					{
					 startIndex+=A.length()+1;
					 continue;
					}
		         // A word is obtained , so now search for it in the Sorted Keywords array.
				else                            
				{
					startIndex=k+1;
					SearchForWord sfw = new SearchForWord();
					
					// this function returns 0 if word A exists in the list of KEYWORDS
					int res = sfw.Search(A,Keyword);    
				
					// Keyword exists
					if(res==0)
					{
					    count++;
						atLeastOne++;
						if(flag==0)
						{
							
							out1.write("Line "+ lineNo +": " + A + "(" + indexNo + ")  ");
							flag=1;
						}
						else out1.write(A + "(" + indexNo + ")  ");
					}
					
	               // Reset the Word.
					A="";            
				}
				indexNo=startIndex;;

			}
			
			//Create a new line only if at least one keyword is found in the line. 
			if(atLeastOne>-1)
				out1.newLine();
			lineNo++;
		}
		out1.newLine();
		out1.newLine();
		
		out1.write("Number of keywords found = "+ count);
		System.out.println("File Has been created...!! \nTotal number of KEYWORDS  :  " + count  );
			
    ob2.close();	
    inp1.close();
    inp2.close();
	out1.close();
	}
	

}


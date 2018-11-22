package Assignment2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class SearchAndSort {
	
	public int  search_and_send(String Dict[], String Target) {
		Searching OBJ= new Searching();
		return OBJ.Search_String(Dict, Target);
	}

	public static void main(String[] args) throws IOException, Exception
	{
		
		BufferedReader rd1 = new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW2\\HW2-dictionary.txt"));    //BR Object to read the file
		BufferedReader rd2 = new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW2\\HW2-keywords.txt"));
		
		BufferedWriter out1 = new BufferedWriter(new FileWriter("H:\\JAVA_ASSIGNMENTS\\HW2\\Output_LAB3.txt"));      //BR Object to output to the OUTPUT.txt

		String s="";
		
		String Dict[] = new String[16000];
		String Keyword[] = new String[84];
		
		int i=0,j=0;
		
		while((s=rd1.readLine())!=null)
		{
			Dict[i]=s;
			i++;
			
		}
		while((s=rd2.readLine())!=null)
		{
			Keyword[j]=s;
			j++;
			
		}
		
        int count =0;                                              //Variable to display the count of Non Occurring Keywords
        
		Sorting ob1= new Sorting();
		ob1.Bubble_sort(Dict);                                    // Sorting Both DICTIONARY and KEYWORDS files
		Sorting ob2= new Sorting();
		ob2.Bubble_sort(Keyword);

        SearchAndSort objt= new SearchAndSort();		
		for(i=0;i<Keyword.length;i++)
		{
		   int res = objt.search_and_send(Dict, Keyword[i]);                  
		    if(res!=0)                                            // returned value is checked to see if its  zero
		    	                                                  // If zero it means keyword exists, else send the keyword to the output file
		    	
			   {
		    
		    	count++;
		    	
			   out1.write("  keyword not found:  " + Keyword[i]);
			   out1.newLine();
			   }
		}
		
		out1.newLine();
		out1.newLine();
		out1.write("  No. of keywords not found : " +count);
		
		System.out.println("File Has Been Created...!!");
		   rd1.close();
		   rd2.close();
		   out1.close();
		  
	}

}

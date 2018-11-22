package assignments;

import java.io.*;

public class Student_Grading
{
	public static int getpc(int p)     //This function first calculates the percentage marks of the student and then rounds it off to the nearest integer.
	{

		double x= p*100.00/420.00;
		double y= x-(int)x;
		int per =(int)x;
		if(y>=0.5)
		{
			per=(int)x+1;
		}
		else per=(int)x;
		return per;		
	}
	public static char grade(int pc)     //This function returns the grade achieved by a student object.
	{
		if(pc>=90)
			return 'A';
		else if(pc>=80)
			return 'B';
		else if(pc>=62)
			return 'C';
		else if(pc>=46)
			return 'D';
		else return 'E';
	
	}
	
	
	    
	public static void main(String a[]) throws IOException,Exception
	{
		BufferedReader rd=new BufferedReader(new FileReader("H:\\JAVA_ASSIGNMENTS\\HW1\\HW1\\HW1-data.txt"));             //BR Object to read the file
		BufferedWriter out=new BufferedWriter(new FileWriter("H:\\JAVA_ASSIGNMENTS\\HW1\\HW1\\Output.txt"));              //BR Object to output to the OUTPUT.txt
		BufferedWriter out2=new BufferedWriter(new FileWriter("H:\\JAVA_ASSIGNMENTS\\HW1\\HW1\\Summary.txt"));            //BR Object to output to the SUMMARY.txt
		String Head="  Stdnt ID    EX  ------------- Assignments --------------  Tot   Mi  Fin  CL  Pts  Pct  Gr";
		
		out.write(Head);
		out.newLine();
		     Head="-------------  ---  ----------------------------------------------  -----  ---  ---  ----  ----   ---    --";
		out.write(Head);
		out.newLine();
		String s=null;
		
		int grade_array[] =new int[5];             //Array to store the count of grades.
		for(int i=0;i<5;i++)
			grade_array[i]=0;
		int maxpts=0;
		int n=0;
		
		double average=0;
		int count =0;
		
		 while((s = rd.readLine()) != null)
		 {
			 count++;
			 
			//This function splits the line read from the file according to one or more whitespace characters
			String[] str=s.split("\\s+");          
			int asum=0;
			String f=str[0]+"  ";
			
			
			for(int i=1;i<str.length;i++)
			{
				
				//parsing of string values to INTEGER
				if(Integer.parseInt(str[i])<10)    
				f=f+"  "+str[i]+"  ";                
				else f=f+str[i]+"  ";
				
				//Array entries from 2 to 12 indicate marks, just add them to TOTAL marks. 
				if(i>=2&&i<12)                     
				{
					if(str[i]!=null)               
					asum=asum+Integer.parseInt(str[i]);
				}
				if(i==11)
				 {
				
					  //INDENTATION PURPOSE
					if(asum<100)                  
						f=f+"  "+asum +"  ";
				
					f=f+asum+"  ";}
			}
			
			asum=asum+Integer.parseInt(str[1])+Integer.parseInt(str[12])+Integer.parseInt(str[13])+Integer.parseInt(str[14]);
			f=f+asum+"   ";
			
			//asum=asum-Integer.parseInt(str[14]);
			if(asum>maxpts)
				maxpts=asum;
			average+=asum;
			
			int pc=getpc(asum);
			f=f+pc+"   ";
			char grade=grade(pc);
			n= (int)grade-65;
			grade_array[n]=grade_array[n]+1;
			
			f=f+"  "+grade;
			out.write(f);
			out.newLine();
			
			
		 }
		 
		 out.newLine();
		 out.newLine();
		 out.newLine();
		 out.write("Average total point percent of all students :  " + (double)(average/count));
		 
		 
		 out.newLine();
		 out.newLine();
		 out.write("No of A's  =    "+ grade_array[0]);
		 out.newLine();
		 out.write("No of B's =  "+ grade_array[1]);
		 out.newLine();
		 out.write("No of C's =  "+ grade_array[2]);
		 out.newLine();
		 out.write("No of D's =    "+ grade_array[3]);
		 out.newLine();
		 out.write("No of F's =    "+ grade_array[4]);
		 
		 out.newLine();
		 out.newLine();
		 out.write("Maximum Pts  :   " + maxpts);
		 
		 
		 //*****************************************//
         
		 out2.write("Average total point percent of all students :  " + (double)(average/count));
		 
		 
		 out2.newLine();
		 out2.newLine();
		 out2.write("No of A's =    "+ grade_array[0]);
		 out2.newLine();
		 out2.write("No of B's =  "+ grade_array[1]);
		 out2.newLine();
		 out2.write("No of C's =  "+  grade_array[2]);
		 out2.newLine();
		 out2.write("No of D's =    "+ grade_array[3]);
		 out2.newLine();
		 out2.write("No of F's =    "+ grade_array[4]);
		 
		 out2.newLine();
		 out2.newLine();
		 out2.write("Maximum Pts  :   " + maxpts);

		 
		 rd.close();
		 out.close();
		 out2.close();
		 
		 System.out.println("File Has Been Created...!!!");
		 
	}

}

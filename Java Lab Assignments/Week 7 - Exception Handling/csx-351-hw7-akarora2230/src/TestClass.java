import java.util.Scanner;

public class TestClass {

	
  String name;
  char grade;
  int marks[];
  double avg_marks;
  
  
  //Constructor Declared
  
  public TestClass(String name, int marks[])
  {
	  this.name=name;
	  this.marks=marks;
	  calculateAvgMarks();
	  calculateGrade();
  }
  
  
         //Utility Functions
  
  
  // 1.To calculate Average marks
  void calculateAvgMarks()
  {
	  avg_marks=(marks[0]+marks[1]+marks[2]+marks[3])/4.0;
  }
  
  
  // 2. To calculate grade
  void calculateGrade()
  {
	  if(avg_marks>=90)
	  grade='A';
	  
	  else if(avg_marks>=80)
		  grade='B';
	  else if(avg_marks>=70)
		  grade='C';
	  else if(avg_marks>=60)
		  grade='D';
	  else grade='F';
	  
  }
  
  
  //To display the details of A Student Object
   void display()
  {
	  System.out.println("Name\t\t:"+ name);
	  System.out.println("Average Marks\t: "+avg_marks);
	  System.out.println("Grade\t\t : "+grade);
	  System.out.println("\n\n");
  }
  
   
   //Main method
 public static void main(String[] args)
	{
	    
	  
	    // TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the Number of Students  " );
		int NOS=s.nextInt();
		
		TestClass[] Object_array=new TestClass[NOS];
		
		for(int i=0;i<NOS;i++)
		{
			String name;
			System.out.println("Enter the name of the studnt : ");
			name=s.next();
			int marks[]=new int[4];
			
			System.out.println(" Enter the marks of "+name+" : ");
			for(int j=0;j<4;j++)
				{
				marks[j]=s.nextInt();
				if(marks[j]<0 || marks[j]>100)
			     	{
					System.out.println("Entered marks are out of range\n Please Re-Enter");
					j--;
				    }
				}
			Object_array[i]=new TestClass(name, marks);
			
			
		}
		
		for(int i=0;i<NOS;i++)
		{
			Object_array[i].display();
		}
		s.close();
		
	}
		
}

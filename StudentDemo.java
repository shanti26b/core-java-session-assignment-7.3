package assignment7;

public class StudentDemo {//taking another class StudentDemo 

	public static void main(String[] args ) { //here I'm creating main method
		
		Student s =new Student();      //creating objects which calls Student class
		Student s1 =new Student(10,"sruthi");
		Student s2=new Student(11,"uma",50000);  
		
		
		s.display();           //here it displays the details 
		s1.display();
		s2.display();  
		  
		}
	}  



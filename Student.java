/* here in this program we are showing how we can implement method overloading using this keyword
 * In java, this is a reference variable that refers to the current object.
 * If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
 * this can be used to return the current class instance from the method.
 */


package assignment7;  //here I have created package name 


public class Student { //taking the main class as Student 
	
	int rollno;   //creating three variables of student class
	String name;  
	float fee;  
	
	Student (){    //here i have taken method with empty parameters          
		            //so it shows the null values
			}
	Student (int rollno,String name){// here I have taken two parameters in a method 
	this.rollno =rollno;         //here i have taken this keyword which refers the current class of an object
	this.name = name;
}
	Student(int rollno,String name,float fee){  //here taking three parameters which we can show that method overloading
	this.rollno=rollno;             
	this.name=name;                          //here i have taken this keyword which refers the current class of an object
	this.fee=fee;  
	}  
	
	void display(){                           //here to display we are taking the method to display
		
		System.out.println( " student rollno :" +rollno);   //it prints these values
		System.out.println( " student name :" +name);
		System.out.println( " student fee :" +fee);
	}  
	}  
	  
import java.io.*;
import java.util.ArrayList;

class Student
{
    int age;
    String name;
    int rollNumber;
}

class StudentManagementSystem
{
    public static void main(String args[])
    {
        DataInputStream in = new DataInputStream(System.in);
        ArrayList<Student> students = new ArrayList<Student>();



        try
        {
        	System.out.println("how many students you want to enter");
        	int n=Integer.parseInt(in.readLine());
        	
     
        
        	for(int i=0;i<n;i++)
        	{
        		   Student s = new Student();
            System.out.println("Enter your age:");
            s.age = Integer.parseInt(in.readLine());

            System.out.println("Enter your name:");
            s.name = in.readLine();

            System.out.println("Enter your roll number:");
            s.rollNumber = Integer.parseInt(in.readLine());
            

         students.add(s);
        	}
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("\nStudent Details");
         
        for(Student s : students)
        {
            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("------");
        }
         
    }
}




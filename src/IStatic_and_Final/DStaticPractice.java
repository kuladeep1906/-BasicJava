
package IStatic_and_Final;
import java.util.*;

class Student
{
    private String rollNo;
    
    private static int count=1;
    
    String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo=assignRollNo();
    }
    
}

public class DStaticPractice 
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        
        System.out.println(s1.assignRollNo());
        System.out.println(s2.assignRollNo());
        System.out.println(s3.assignRollNo());
        
    }   
}
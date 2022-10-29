package oops;

public class Student 
{
	String Sname;
	int Srollno;
	long Smobno;
	

	Student(String name,int rollno,long mobno)
	{
		Sname=name;
		Srollno=rollno;
		Smobno=mobno;
	}
	void display()
	{
		System.out.println(Sname);
		System.out.println(Srollno);
		System.out.println(Smobno);
	}

	public static void main(String[] args) 
	{
		Student s1=new Student("Ram",1,1234567890);
		s1.display();

		Student s2=new Student("Sham",2,9874561230l);
		s2.display();
	}

}

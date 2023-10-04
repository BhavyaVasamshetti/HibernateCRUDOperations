package Hibernate;

public class Main {
    public static void main(String args[])
    {
    	StudentRepo sr=new StudentRepoImpl();
    	
    	Student s=new Student();
    	s.setSid(10);
    	s.setSname("abc");
    	s.setSdept("Btech");
    	sr.insertStudent(s);
    	
    	Student s1=new Student();
    	s1.setSid(11);
    	s1.setSname("def");
    	s1.setSdept("BBA");
    	sr.insertStudent(s1);
    	
    	Student s2=new Student();
    	s2.setSid(12);
    	s2.setSname("ghi");
    	s2.setSdept("Btech");
    	sr.insertStudent(s2);

    	    	
    	Student s4=new Student();
    	s4.setSid(13);
    	s4.setSname("abc");
    	s4.setSdept("Btech");

    	sr.updateStudent(s4);
    	

    	Student s5=new Student();
    	s5.setSid(11);
    	sr.deleteStudent(s5);
    	
    	sr.selectStudents();
    	
    	
    }
}



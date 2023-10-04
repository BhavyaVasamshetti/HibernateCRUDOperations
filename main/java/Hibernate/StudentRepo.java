package Hibernate;

public interface StudentRepo {
	
	    void insertStudent(Student s);
	    void updateStudent(Student s);
	    void deleteStudent(Student s);
	    void selectStudents();
	}



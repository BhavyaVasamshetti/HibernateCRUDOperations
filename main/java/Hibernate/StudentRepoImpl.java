package Hibernate;
import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class StudentRepoImpl implements StudentRepo{
	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("config.xml").build();
	Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
	
	SessionFactory sfactory=meta.buildSessionFactory();

	public void insertStudent(Student s) 
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(s);
		transaction.commit();
		
	}

	public void updateStudent(Student s) 
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.saveOrUpdate(s);
		transaction.commit();
		
	}

	public void deleteStudent(Student s) 
	{
		Session session=sfactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(s);
		transaction.commit();
	}

	public void selectStudents()
	{
		Session session=sfactory.openSession();
		TypedQuery tq=session.createQuery("from Student");
		List<Student> list=tq.getResultList();
		Iterator<Student> itr=list.iterator();
		 while(itr.hasNext())
			 System.out.println(itr.next());
		
	}

}



package oneToOne.example1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import course.Course;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sf;
    	try {
			sf = cfg.buildSessionFactory();
		} catch (Exception e) {
			// TODO: handle exception
		
		}
    	Session ss = sf.openSession();
    	Transaction transaction = ss.beginTransaction();
    	Employee employee = new Employee();
    	employee.setName("John");
    	employee.setEmail("123@gmail.com");
    	
    	
    	
    }
}

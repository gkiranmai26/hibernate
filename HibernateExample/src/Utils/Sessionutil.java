package Utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Sessionutil {
	static Configuration cfg = null;
	static SessionFactory factory = null;
	
	public static Session getSession(){
		return factory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session!=null){
			session.close();
		}
	}
	
	static{
		System.out.println("Static block is executed");
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		factory=cfg.buildSessionFactory();	
	}
	// Session factory is costly operation 
	
}

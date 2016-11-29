package QC.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {
	private static SessionFactory sFactory = null;
	private static Configuration configuration = null;
	private static Session session ;
	static{
		configuration = new Configuration();
		configuration.configure();
	}
	// 获取ȡsessionfactory
	private static SessionFactory getSessionFactory(){
		if (sFactory == null) {
			sFactory 
			= configuration.buildSessionFactory();
		}
		
		return sFactory;
	}
	
	// 获取session
	public static Session getSession(){
		session=getSessionFactory().openSession();
		return session;
	}
	public static void closeSesion(){
		if(session!=null){
			session.close();
		}
	}
	
}

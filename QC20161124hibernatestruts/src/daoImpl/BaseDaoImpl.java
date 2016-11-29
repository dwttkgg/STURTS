package daoImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import model.User;

import org.hibernate.Session;
import org.hibernate.Transaction;

import QC.utils.SessionFactoryUtil;
import dao.IBaseDao;

public class BaseDaoImpl implements IBaseDao{


	public boolean addObject(Object obj) {
		boolean flag=true;
		Session session=null;
		Transaction transaction=null;
		
		try{
			session=SessionFactoryUtil.getSession();
			transaction = session.beginTransaction();
			session.persist(obj);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
			flag=false;
		}finally{
			SessionFactoryUtil.closeSesion();
		}
		
		return flag;
	}


	public boolean deleteObject(Class cl, Serializable id) {
		boolean flag=true;
		Session session=null;
		Transaction transaction=null;
		try{
			session=SessionFactoryUtil.getSession();
			transaction=session.beginTransaction();
			session.delete(session.get(cl, id));
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}

	
	public Object getById(Class c1, Serializable id) {
		Object object=null;
		Session session=null;		
		try{
			//获取到Session
			session=SessionFactoryUtil.getSession();
			//持久化
			object=session.get(c1, id);	
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			if(session!=null){
				session.close();
			}
		}
		
		return object;
	}

	public boolean updateObject(Object obj) {
		boolean flag=true;
		Session session=null;
		Transaction transaction=null;
		try{
			session =SessionFactoryUtil.getSession();
			transaction=session.beginTransaction();
			session.update(obj);
			transaction.commit();
		}catch(Exception e){
			e.printStackTrace();
			transaction.rollback();
			flag =false;
		}finally{
			if(session!=null){
				session.close();
			}
		}
		return flag;
		
	}
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		Session session = null;
		try {
			session = SessionFactoryUtil.getSession();
			// hql语句，使用类代替表名，属性代替字段名
			String hql = "from User";
			
			list = session.createQuery(hql).list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return list;
	}
}

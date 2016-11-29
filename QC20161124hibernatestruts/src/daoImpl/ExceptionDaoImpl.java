package daoImpl;

import QC.exception.Myexception;
import dao.ExceptionDao;


public class ExceptionDaoImpl implements ExceptionDao {

	public boolean add(Object obj) throws Myexception {
		boolean flag = true;
		try{
			int a=10/0;
		}catch(Exception  e){
			flag=false;
			throw new Myexception("com.seecen.dao.impl.ExceptionDaoImp--->addUser: "+e.getMessage());
		}
		return flag;
	}

	

}

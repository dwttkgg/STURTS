package QC.exception;

import com.sun.org.apache.bcel.internal.generic.NEW;

import dao.ExceptionDao;
import daoImpl.ExceptionDaoImpl;
import QC.utils.BaseAction;

public class ExceptionAction extends BaseAction {
	ExceptionDao exDao = new ExceptionDaoImpl();

	public String execute() throws Myexception {
		boolean flag = exDao.add(new Object());
		if (flag) {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
}

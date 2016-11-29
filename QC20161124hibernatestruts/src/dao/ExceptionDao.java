package dao;

import QC.exception.Myexception;

public interface ExceptionDao{
	boolean add(Object obj) throws Myexception;
}

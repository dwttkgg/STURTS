package dao;

import java.io.Serializable;
import java.util.List;

import model.User;

public interface IBaseDao {
	boolean addObject(Object obj);
	boolean updateObject(Object obj);
	boolean deleteObject(Class cl, Serializable id);
	Object getById(Class cl, Serializable id);
	List<User> getAllUsers();
	
}

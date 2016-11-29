package struts;

import java.util.List;

import org.omg.CORBA.Request;

import model.User;

import com.opensymphony.xwork2.ModelDriven;

import dao.IBaseDao;
import daoImpl.BaseDaoImpl;
import QC.utils.BaseAction;

public class strutsAction extends BaseAction implements ModelDriven<User>{
	private User user=null;
	IBaseDao baseDao=new BaseDaoImpl();
	
	public User getModel() {
		user=new User();
		return user;
	}

	public String execute() throws Exception {
		List<User> list=baseDao.getAllUsers();
		if(list!=null){
			servletRquest.setAttribute("list", list);
			return "list";
		}else{
			return ERROR;
		}		
	}
	public String add(){
		boolean flag =baseDao.addObject(user);
		if(flag){
			//servletRquest.setAttribute("tips","添加成功");
			return "addsuccess";
		}else{
			//servletRquest.setAttribute("tips","添加失败");
			return ERROR;
		}	
	}
	public String del(){
		
		boolean flag= baseDao.deleteObject(user.getClass(), user.getId());
		if(flag){
			return "delsuccess";
		}else{
			return ERROR;
		}
	}
}

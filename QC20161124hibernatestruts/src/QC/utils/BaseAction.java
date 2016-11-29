package QC.utils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;



public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	protected HttpServletRequest servletRquest;
	protected HttpServletResponse servletResponse;
	protected HttpSession session;
	protected ServletContext application;
	
	public void setServletContext(ServletContext application) {
		this.application = application;
	}
	
	public void setServletResponse(HttpServletResponse servletResponse) {
		this.servletResponse = servletResponse;
	}
	
	public void setServletRequest(HttpServletRequest servletRequest) {
		this.servletRquest = servletRequest;
		this.session = this.servletRquest.getSession();
	}

}

package QC.utils;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;


public class createTableDeml {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		//加载配置文件
		configuration.configure();
		SchemaExport schemaExport=new SchemaExport(configuration);
		schemaExport.create(true,true);
	}
}

package pkg_sinopec;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Log4jInit extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Constructor of the object.
	 */
	public Log4jInit() {
		super();
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Log4j-sinopec init");
        String prefix = config.getServletContext().getRealPath("/");
        String file = config.getInitParameter("log4j");
        String filePath = prefix + file;
        Properties props = new Properties();
        // String path = "/oracle/middleware/user_projects/domains/base_domain/servers/AdminServer/upload/logs/";
        //String path = "C:/jboss-as-7.1.0.Final/standalone/deployments/sinopec.war";
       String path = "/opt/weblogic/user_projects/domains/base_domain/servers/bmzww";
        try {
            FileInputStream istream = new FileInputStream(filePath);
            props.load(istream);
            istream.close();
            String logFile = path + props.getProperty("log4j.appender.sinop.File");//设置路径
            toPrint(logFile);
            props.setProperty("log4j.appender.sinop.File",logFile);
            
            logFile = path + props.getProperty("log4j.appender.ccic.File");//设置路径
            toPrint(logFile);
            props.setProperty("log4j.appender.ccic.File",logFile);
           
            logFile = path + props.getProperty("log4j.appender.Logfile.File");//设置路径
            toPrint(logFile);
            props.setProperty("log4j.appender.Logfile.File",logFile);
            
            logFile = path + props.getProperty("log4j.appender.policy.File");//设置路径
            toPrint(logFile);
            props.setProperty("log4j.appender.policy.File",logFile);
           
            PropertyConfigurator.configure(props);//装入log4j配置信息
        } catch (IOException e) {
            toPrint("Could not read configuration file [" + filePath + "].");
            toPrint("Ignoring configuration file [" + filePath + "].");
            return;
        }
    }
    public static void toPrint(String content) {
        System.out.println(content);
    }

}

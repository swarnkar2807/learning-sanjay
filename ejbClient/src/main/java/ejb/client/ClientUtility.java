package ejb.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientUtility {
	private static Context initialContext = null;
	
	static Context getInitialContext() throws NamingException{
		if(initialContext == null){
			Properties prop = new Properties();
			prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
			initialContext = new InitialContext(prop);
		}
		return initialContext;
		}
	}

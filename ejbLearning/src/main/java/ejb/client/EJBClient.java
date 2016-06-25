package ejb.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejb.session.HelloStatelessBeanRemote;

public class EJBClient {

	public static void main(String[] args) {
		callEJB();
	}
	public static void callEJB(){
		try {
			InitialContext context = (InitialContext) ClientUtility.getInitialContext();//new InitialContext(prop);
			String lookupName = getLookupName();

			HelloStatelessBeanRemote bean = (HelloStatelessBeanRemote)context.lookup(lookupName);
			System.out.println("message form EJB : "+bean.sayHello());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private  static String getLookupName(){
		String appName = "";
		String moduleName = "ejbLearning-0.0.1-SNAPSHOT";
		String distnictName = "";
		String beanName = "HelloStatelessBean";
		final String interfaceName = "ejb.session.HelloStatelessBeanRemote";

		String name = "ejb:"+appName+"/"+moduleName+"/"+distnictName+"/"+beanName+"!"+interfaceName;
		return name;
	}
}

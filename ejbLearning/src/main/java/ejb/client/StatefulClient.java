package ejb.client;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import ejb.stateful.AccountRemote;

public class StatefulClient {
	public static void main(String[] args) throws NamingException, InterruptedException {
		doEJBCall();
	}
	
	public  static void doEJBCall() throws NamingException, InterruptedException{
		InitialContext context = (InitialContext)ClientUtility.getInitialContext();
		String lookupName = getLookupName();
		
		AccountRemote accountRemote = (AccountRemote) context.lookup(lookupName);
		
		for(int i =1; i<=1000;i++){
			Thread.sleep(1000);
			accountRemote.deposite(10);
		}
//		accountRemote.deposite(150);
		
		accountRemote.accountDetails();
		
	}
	private static String getLookupName(){
		String appName = "";
		String moduleName = "ejbLearning-0.0.1-SNAPSHOT";
		String distnictName = "";
		String beanName = "Account";
		final String interfaceName = "ejb.stateful.AccountRemote";

		String name = "ejb:"+appName+"/"+moduleName+"/"+distnictName+"/"+beanName+"!"+interfaceName+"?stateful";
		return name;
		
	}
}

package ejb.session;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloStatelessBean
 */
@Stateless
public class HelloStatelessBean implements HelloStatelessBeanRemote {
	int countOfCall = 0;

    /**
     * Default constructor. 
     */
    public HelloStatelessBean() {
        // TODO Auto-generated constructor stub
    	
    }
    public String sayHello(){
		return "hello sanjay  "+countOfCall;
	}
}

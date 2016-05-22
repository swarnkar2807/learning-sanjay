package ejb.session;

import javax.ejb.Remote;

@Remote
public interface HelloStatelessBeanRemote {

	public String sayHello();
}

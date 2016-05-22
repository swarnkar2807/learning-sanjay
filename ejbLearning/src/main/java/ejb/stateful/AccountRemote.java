package ejb.stateful;

import javax.ejb.Remote;

@Remote
public interface AccountRemote {

	public void deposite(double amount);
	public void accountDetails();
	public String getName() ;
	public void setName(String name);
}

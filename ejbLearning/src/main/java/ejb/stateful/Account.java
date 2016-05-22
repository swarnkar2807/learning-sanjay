package ejb.stateful;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Account
 */
@Stateful
@LocalBean
public class Account implements AccountRemote {

	/**
	 * Default constructor. 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}
	static int objectCount;
	double balance ;
	private String name;
	
	@PostConstruct
	private void init(){
		System.out.println("new object is created : "+ (++objectCount));
		balance = 0;
	}

	public void deposite(double amount){
		balance = balance+ amount;
		
		System.err.println("after adding "+amount+" balance : "+balance);
	}

	public void accountDetails(){
		System.out.println("name : "+name+" balance  "+balance);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

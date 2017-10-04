package polymorphism;

public class Account {
	private String accountHolder;
	private String location;

	public Account(String accountHolder, String location) {
		
		this.accountHolder = accountHolder;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Account [accountHolder=" + accountHolder + ", location=" + location + "]";
	}
	
	

}

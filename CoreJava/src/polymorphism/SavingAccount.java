package polymorphism;

public class SavingAccount extends Account {	

private String AccountName;
private int accountNumber;

public SavingAccount(String acountName,int accountNumber,String accountHolder, String location) {
	super(accountHolder, location);
	this.AccountName=acountName;
	this.accountNumber=accountNumber;
}

@Override
public String toString() {
	return "SavingAccount [AccountName=" + AccountName + ", accountNumber=" + accountNumber + "]";
}



}

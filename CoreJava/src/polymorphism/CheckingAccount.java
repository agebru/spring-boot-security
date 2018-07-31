package polymorphism;

public class CheckingAccount extends Account {
private String branch;
private int checkingacctNumber;

public CheckingAccount(String accountHolder, String location, String branch, int checkingacctNumber) {
	super(accountHolder, location);
	this.branch = branch;
	this.checkingacctNumber = checkingacctNumber;
}

@Override
public String toString() {
	return "CheckingAccount [branch=" + branch + ", checkingacctNumber=" + checkingacctNumber + "]";
}



}

import java.util.ArrayList;

class BankAccount
{
	private String name;
	private double balance = 0;
	private ArrayList<String> transactionLog = new ArrayList<String>();
	
	public BankAccount(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {				//Adds the amount to the balance. The Arraylist adds a string which describes the transaction and the amount in transaction.
		balance += amount;
		transactionLog.add("Deposit of "+amount+ " euros");
	}
	
	public double withdraw(double amount) {				//Removes the amount from the balance if there are enough money (balance>amount). The Arraylist adds a string which describes the transaction and the amount in transaction.
		if (balance > amount) {
			balance -= amount;
			transactionLog.add("Withdrawal of "+amount+ " euros");
			return amount;
		}
		else {
			return 0;
		}
	}
	
	public void printStatement() {					//Prints the holder's name, the balance and a list with the transactions of the account.
		System.out.println(name + " " + "account");
		for (String y: transactionLog){
			
			System.out.println(y);
		}
		System.out.println("The balance in the account is "+ balance);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		transactionLog.add("Change of name from "+this.name+ " to "+name);
		this.name = name;
	}
}
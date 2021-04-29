class TestBankAccount
{
	public static void main(String[] args){
		BankAccount myAccount = new BankAccount("Name_1");
		myAccount.deposit(100);
		double pocketMoney = myAccount.withdraw(50);
		myAccount.deposit(100);
		pocketMoney += myAccount.withdraw(200);
		myAccount.setName("Name_2");
		myAccount.printStatement();
		System.out.println("Pocket money is "+pocketMoney);
	}
}





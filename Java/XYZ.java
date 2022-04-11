class Bank {

	
	int balance = 10000;


	int debit(int amount)
	{
		if (balance >= amount && balance >= 5000) {

			balance = balance - amount;
			return amount;
		}

		else {
			
            return 0;
		}
	}

	int credit(int amount)
	{
		balance = balance + amount;
		return amount;
		
	}

    int checkBalance(){
        return balance;
    }
}

class XYZ {

	public static void main(String[] args)
	{
	
		Bank account = new Bank();
		if (account.balance >= 5001){
			
			System.out.println("sucessfully debitted "	+ (account.debit(2000)));
			System.out.println(" Your Balance is " + (account.checkBalance()));
			
			System.out.println("sucessfully debitted "	+ (account.debit(6000)));
			System.out.println(" Your Balance is " + (account.checkBalance()));
			
			System.out.println(" sucessfully credited " + (account.credit(1000)));
			System.out.println(" Your Balance is " + (account.checkBalance()));
			
			System.out.println("sucessfully debitted "	+ (account.debit(2000)));

		}

		else {

			System.out.println("You don't have sufficient balance");
		}
	}
}

/* 
Author:Kevin Mwithiga
Reg No:CT101/G/19870/23
Bank Application
*/

//Base Class
abstract class account{

//Protected Attribute
protected double balance;

//Constructor
public account(double balance){
	this.balance = balance;
}

//Deposit Method
public void deposit(double amount) {
	balance += amount;
}

//Abstract method for withdrawal
public abstract void withdraw(double amount);

//Request User to input balamce
public void showBalance() {
System.out.println("Current balance: $" + balance);
	}
}

//Subclass:SavingsAccount
class SavingsAccount extends account {
public  SavingsAccount(double balance) {
	super(balance);
	}

//Overide
public void withdraw(double amount) {
 if(balance - amount >= 100) {
	balance -= amount;
	}
 else {
System.out.println("Withdrawal denied: Minimum balance $100 required.");
		}
	}
}

//Subclass:CheckingAccount
class CheckingAccount extends account {
public CheckingAccount(double balance) {
	super(balance);
	}
//Overide
public void withdraw(double amount) {
 if(balance - amount - 1 >= 0) {
	balance -= (amount + 1);
	}
 else {
System.out.println("Withdrawal denied: Insufficient balance");
		}
	}

}

//Mainclass:bankApp
public class bankApp {
public static void main(String[] args) {

//Creating a object called SavingsAccount
SavingsAccount savings = new SavingsAccount(1000);

//Deposit 200
savings.deposit(200);

//Try to withdraw 550
savings.withdraw(550);

//Try to withdraw 200
savings.withdraw(1100);

//Display balance
savings.showBalance();

//Creating a object called
CheckingAccount check = new CheckingAccount(450);

//Deposit 100
check.deposit(100);

//Try to withdraw 250
check.withdraw(650);

//Try to withdraw 200
check.withdraw(200);

//Display balance
check.showBalance();
	}
}

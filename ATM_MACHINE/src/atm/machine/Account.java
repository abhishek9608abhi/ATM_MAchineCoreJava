package atm.machine;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account 
{
     private int customerNumber;
     private int pinNumber;
     private double checkingBalance=0;
     private double savingBalance=0;
     
     Scanner scan= new Scanner(System.in);
     DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
     
     /*Set the customer number*/
     public int setCustomerNumber(int customerNumber)
     {
    	 this.customerNumber=customerNumber;
    	 return customerNumber;
     }
     /*Get the customer number*/
     public int getCustomerNumber()
     {
    	 return customerNumber;
     }
     
     /*Set the Pin number*/
     public int setPinNumber(int pinNumber)
     {
    	 this.pinNumber=pinNumber;
    	 return pinNumber;
     }
     /*Get the Pin number*/
     public int getPinNumber()
     {
    	 return pinNumber;
     }
     
     /*Get Checking Account Balance*/
     public double getCheckingBalance()
     {
    	 return checkingBalance;
     }
     /*Get Saving Account Balance*/
     public double getSavingBalance()
     {
    	 return savingBalance;
     }
     
     /*Calculate Checking Account Withdraw */
     public double calcCheckingWithdraw(double amount)
     {
    	 checkingBalance= (checkingBalance- amount);
    	 return checkingBalance;
     }
     
     /*Calculate Saving Account Withdraw */
     public double calcSavingingWithdraw(double amount)
     {
    	 savingBalance= (savingBalance- amount);
    	 return savingBalance;
     }
     
     /*Calculate Checking Account Deposit */
     public double calcCheckingDeposit(double amount)
     {
    	 checkingBalance= (checkingBalance + amount);
    	 return checkingBalance;
     }
     
     /*Calculate Saving Account Deposit */
     public double calcSavingDeposit(double amount)
     {
    	 savingBalance= (savingBalance + amount);
    	 return savingBalance;
     }
     
     /*Customer Checking Account Withdraw Input*/
     public void getCheckingWithdrawInput()
     {
    	 System.out.println("Checking Account Balance :"+ moneyFormat.format(checkingBalance));
    	 System.out.print("Amount you want to withdraw from checking Amount :");
    	 double amount=scan.nextDouble();
    	 
    	 if((checkingBalance - amount)>=0)
    	 {
    		 calcCheckingWithdraw(amount);
    		 System.out.println("New checking Account Balance :"+ moneyFormat.format(checkingBalance));
    	 }
    	 else
    	 {
    		 System.out.println("Balance can not be Negative."+"\n");
    	 }
     }
     
     /*Customer Saving Account Withdraw Input*/
     public void getSavingWithdrawInput()
     {
    	 System.out.println("Saving Account Balance :"+ moneyFormat.format(savingBalance));
    	 System.out.print("Amount you want to withdraw from saving Amount :");
    	 double amount=scan.nextDouble();
    	 
    	 if((savingBalance - amount)>=0)
    	 {
    		 calcSavingingWithdraw(amount);
    		 System.out.println("New saving Account Balance :"+ moneyFormat.format(savingBalance));
    	 }
    	 else
    	 {
    		 System.out.println("Balance can not be Negative."+"\n");
    	 }
     }
     
     /*Customer Checking Account Deposit Input*/
     public void getCheckingDepositInput()
     {
    	 System.out.println("Checking Account Balance :"+ moneyFormat.format(checkingBalance));
    	 System.out.print("Amount you want to Deposit from Checking Amount :");
    	 double amount=scan.nextDouble();
    	 
    	 if((checkingBalance + amount)>=0)
    	 {
    		 calcCheckingDeposit(amount);
    		 System.out.println("New Checking Account Balance :"+ moneyFormat.format(checkingBalance));
    	 }
    	 else
    	 {
    		 System.out.println("Balance can not be Negative."+"\n");
    	 }
     }
     
     /*Customer Saving Account Withdraw Input*/
     public void getSavingDepositInput()
     {
    	 System.out.println("Saving Account Balance :"+ moneyFormat.format(savingBalance));
    	 System.out.print("Amount you want to withdraw from saving Amount :");
    	 double amount=scan.nextDouble();
    	 
    	 if((savingBalance + amount)>=0)
    	 {
    		 calcSavingDeposit(amount);
    		 System.out.println("New saving Account Balance :"+ moneyFormat.format(savingBalance));
    	 }
    	 else
    	 {
    		 System.out.println("Balance can not be Negative."+"\n");
    	 }
     }
     
}

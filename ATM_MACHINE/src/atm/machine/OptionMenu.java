package atm.machine;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account
{
	Scanner scan= new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.00");
    
    HashMap<Integer, Integer> data= new HashMap<Integer,Integer>();
    /*Validate Login Information customer number and pin Number */
    public void getLogin() throws IOException
    {
    	int x=1;
    	do
    	{
    		try
    		{
    			data.put(1234567, 1234);
    			data.put(9876543, 9876);
    			
    			System.out.println("WELCOME TO THE ATM PROJECT ");
    			System.out.println("Enter your Customer Number :");
    			setCustomerNumber(scan.nextInt());
    			
    			System.out.println("Enter your Pin Number :");
    			setPinNumber(scan.nextInt());
    		}
    		catch(Exception e)
    		{
    			System.out.println("\n" +"Invalid character(s).only number."+ "\n");
    			x=2;
    		}
    		
    		for(Entry<Integer, Integer> entry : data.entrySet())
    		{
    			if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
    			{
    				getAccountType();
    			}
    		}
    		System.out.println("\n"+ "Wrong Customer NUmber or Pin number. "+"\n");
    	}while(x==1);
    }
    
    
    /*Display Account Type Menu with Selection*/
	public void getAccountType()
    {
    	System.out.println("Select the Account you want to access :");
    	System.out.println("Type 1 - Checking Account");
    	System.out.println("Type 2 - Saving Account");
    	System.out.println("Type 3 - Exit");
    	System.out.println("Choice :");
    	
    	int selection = scan.nextInt();
    	
    	switch(selection)
    	{
    	  case 1:
    		     getChecking();
    		     break;
    	  case 2:
 		         getSaving();
 		         break;
    	  case 3:
 		         System.out.println("Thank you for using this ATM, bye.");
 		         break;
 		  default:
 			     System.out.println("\n" + "Invalid Choice." + "\n");
 			     getAccountType();
    		     
    	}
    }
    
    /*Display Checking Account Menu with selections*/
    public void getChecking()
    {
    	System.out.println(" Checking Account :");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.println("Choice :");
    	
        int selection = scan.nextInt();
    	
    	switch(selection)
    	{
    	   case 1:
    		     System.out.println("Checking Account Balance :"+ moneyFormat.format(getCheckingBalance()));
    		     getAccountType();
    		     break;
    	   case 2:
    		     getCheckingWithdrawInput();
    		     getAccountType();
 		         break;
    	   case 3:
    		     getCheckingDepositInput();
 		         getAccountType();
 		         break;
    	   case 4:
 		         System.out.println("Thank you for using this ATM, Byee Byee.");
 		         getAccountType();
 		         break;
 		   default:
 			     System.out.println("\n" + "Invalid Choice." + "\n");
 			     getChecking();
       }
    }
    /*Display Saving Account Menu with selections*/
    private void getSaving() 
    {
    	System.out.println(" Saving Account :");
    	System.out.println("Type 1 - View Balance");
    	System.out.println("Type 2 - Withdraw Funds");
    	System.out.println("Type 3 - Deposit Funds");
    	System.out.println("Type 4 - Exit");
    	System.out.println("Choice :");
    	
        int selection = scan.nextInt();
    	
    	switch(selection)
    	{
    	   case 1:
    		     System.out.println("Saving Account Balance :"+ moneyFormat.format(getSavingBalance()));
    		     getAccountType();
    		     break;
    	   case 2:
    		     getSavingWithdrawInput();
    		     getAccountType();
 		         break;
    	   case 3:
    		     getSavingDepositInput();
 		         getAccountType();
 		         break;
    	   case 4:
 		         System.out.println("Thank you for using this ATM, Byee Byee.");
 		         getAccountType();
 		         break;
 		   default:
 			     System.out.println("\n" + "Invalid Choice." + "\n");
 			     getSaving();
       }	
	}
 } 

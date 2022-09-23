package entidies;

public class BankAccount {
  private int acconuntNumber;
  private String accountName;
  private double cash = 0;
  



  public BankAccount(int acconuntNumber,String accountName, double initialDeposit){
    this.acconuntNumber = acconuntNumber;
    this.accountName = accountName;
    depositCash(initialDeposit);
  }

  public BankAccount(int acconuntNumber,String accountName){
    this.acconuntNumber = acconuntNumber;
    this.accountName = accountName;
    
  }

  public BankAccount(){}

  public void setAcconuntName(String accountName ){
    this.accountName = accountName;
  }

  public String getAccountName(){
    return this.accountName;
  }

  public int getAcconuntNumber(){
    return this.acconuntNumber;
  }

  public double getCash() {
    return this.cash;
  }

  public void depositCash(double value){
    this.cash += value;
  }

  public void withdrawCash(double value){
    this.cash -= (value + 5.00);
  }

  
  public String toString(){
     return "Account: " + getAcconuntNumber() + ", Holder: " + getAccountName() + ", Balance: $" + String.format("%.2f", getCash());
  }
 
  
}


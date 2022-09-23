import java.util.Locale;
import java.util.Scanner;

import entidies.BankAccount;

public class Program {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    BankAccount bankAccount;
    double value;

    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    
    System.out.print("Enter account holder: ");
    String name = sc.next();

    
    
    
    System.out.print("Is there na initial deposit (y/n)? ");
    char check = sc.next().charAt(0);


    if(check == 'y'){
      System.out.print("Enter initial deposit value: ");
      double cash = sc.nextDouble();
      bankAccount = new BankAccount(number, name, cash);
    
    }else{
      bankAccount = new BankAccount(number, name);
    }
    

    System.out.println("Account data:");
    System.out.println(bankAccount.toString());
    
    System.out.print("Enter a deposit value: ");
    value = sc.nextDouble();
    bankAccount.depositCash(value);

    System.out.println("Updated account data: ");
    System.out.println(bankAccount.toString());

    System.out.print("Enter a withdraw value: ");
    value = sc.nextDouble();
    bankAccount.withdrawCash(value);

    System.out.println("Updated account data: ");
    System.out.println(bankAccount.toString());

    
    sc.close();

  }
}
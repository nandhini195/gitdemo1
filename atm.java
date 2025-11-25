import java.util.*;

public class atm{
    static Scanner sc = new Scanner(System.in);
    static double balance = 1000;
    
    public static void main(String[]args){
        while(true){
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option:");
            int choice = sc.nextInt();

            switch  (choice){
                case 1: checkBalance();
                break;
                case 2: depositMoney();
                break;
                case 3: withdrawMoney();
                break;
                case 4: System.exit(0);
                default: System.out.println(" Invalid option. Please try again.");
            }
        }
    }
    public static void checkBalance(){
        System.out.println(" Current balance: " + balance);
    }
    public static void depositMoney(){
        System.out.println(" Enter amount to deposit:");
        double amount = sc.nextDouble();
        if(amount > 0){
            balance += amount;
            System.out.println(" Deposited Successfully: " + amount);
        } else{
            System.out.println(" Invalid amount. Please try again. "); 
        }
    }
        static void withdrawMoney(){
            System.out.println(" Enter amount to withdraw:");
            double amount = sc.nextDouble();
            if(amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println(" Withdrawn Successfully: " + amount);
            } else{
                System.out.println(" Invalid amount or insufficient balance. Please try again.");
            }
        }
        

    }


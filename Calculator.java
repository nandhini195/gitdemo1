import java.util.*;
class Calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Simple Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option:");
            int choice = sc.nextInt();

            if(choice >=1 && choice <=4){
                System.out.print(" Enter first number:");
                double num1 = sc.nextDouble();
                System.out.print(" Enter second number:");
                double num2 = sc.nextDouble();
                double result = 0;
                switch(choice){
                    case 1: result = num1 + num2;
                    System.out.println(" Result: " + result);
                    break;
                    case 2: result = num1 - num2;
                    System.out.println(" Result: " + result);
                    break;
                    case 3: result = num1 * num2;
                    System.out.println(" Result: " + result);
                    break;
                    case 4:
                        if(num2 != 0){
                            result = num1 / num2;
                            System.out.println(" Result: " + result);
                        } else{
                            System.out.println(" Error: Division by zero is not allowed.");
                        }
                        break;
                }


        }

            else if(choice == 5){
                System.exit(0);
            } else{
                System.out.println(" Invalid option. Please try again.");
            }
        }
    }
}
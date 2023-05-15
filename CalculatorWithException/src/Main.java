
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
class MultiplicationException extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("both numbers are too big please enter smaller numbers....");

    }
    
    
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String process =  "1. Addition \n"
                          +"2. Extraction\n"
                          +"3. Multiplicaiton\n"
                          +"4. Division ";
        System.out.println(process);
        System.out.println("************************************");
        System.out.println("Select your process:");
        String islem = scanner.nextLine();
        int a;
        int b;
        try {
        switch(islem){
            case "1":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Sum of entered numbers : " + (a+b));
                break;
            case "2":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Difference of the entered numbers : " + (a-b));
                break;
            case "3":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                if (a > 10000 && b > 10000) {
                    throw new MultiplicationException();
                    
                }
                System.out.println("Multiplication of the entered numbers : " + (a * b));
                break;
            case "4":
                System.out.print("First number: ");
                a = scanner.nextInt();
                System.out.print("Second number: ");
                b = scanner.nextInt();
                System.out.println("Division of the entered numbers : " + (a / b));
                break;
            default:
                System.out.println("Invalid process");
                

            
            
            
        }
        }
        catch (ArithmeticException e) {
            System.out.println("A number cannot be divided by zero...");
        }
        catch(InputMismatchException e) {
            System.out.println("Please enter the inputs in the correct format...");
        } catch (MultiplicationException ex) {
            ex.printStackTrace();
            
        }

    }
}

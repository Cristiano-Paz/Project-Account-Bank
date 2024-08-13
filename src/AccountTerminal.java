import java.util.Scanner;

public class AccountTerminal {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the account:");
        int number = scanner.nextInt();
        
        
        scanner.nextLine();
        
        System.out.println("Enter the agency:");
        String agency = scanner.nextLine();
        
        System.out.println("Enter the name:");
        String nameClient = scanner.nextLine();
        
        System.out.println("Entering your balance:");
        double balance = scanner.nextDouble();
        
        
        String message = "Hello " + nameClient + ", Thank you for creating an account at our bank, your branch is " 
                        + agency + ", account " + number + " your balance " + balance + " is now available to be collected.";
        System.out.println(message);
        
        
        
    }
}

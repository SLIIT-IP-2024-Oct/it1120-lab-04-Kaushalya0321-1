import java.util.Scanner;

public class IT24103427Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Ternary operator
        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        
        // Output the result
        System.out.println("The number is " + result);
        
        // Close the scanner
        scanner.close();
    }
}

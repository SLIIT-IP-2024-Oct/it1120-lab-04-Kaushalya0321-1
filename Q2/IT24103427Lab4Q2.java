import java.util.Scanner;

public class IT24103427Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        int examMarks = scanner.nextInt();
        
        // Validate exam marks
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid input for exam marks. Terminating program.\n");
            return; 
        }
        
        // Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        int labMarks = scanner.nextInt();
        
        // Validate lab submission marks 
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid input for lab submission marks. Terminating program.\n");
            return;  
        }
        
        // Input and validate the percentage for the exam
        System.out.print("Please enter the percentage given for the exam: ");
        int examPercentage = scanner.nextInt();
        
        // Validate the exam percentage
        while (examPercentage < 0 || examPercentage > 100) {
            System.out.print("Invalid input for exam percentage. Terminating program.\n");
            return; 
        }
        
        // Input and validate the percentage for the lab submission
        System.out.print("Please enter the percentage given for the lab submission: ");
        int labPercentage = scanner.nextInt();
        
        // Validate the lab percentage
        while (labPercentage < 0 || labPercentage > 100) {
            System.out.print("Invalid input for lab submission percentage. Terminating program.\n");
            return;
        }
        
        // Validate that the percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.print("The percentages must add up to 100. Terminating program.\n");
            return;
        }  
        
        // Calculate the final exam mark based on the percentages
        double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
        
        // Display the final exam mark
        System.out.println("Final Exam Mark : " + finalMark);
        
        // Close the scanner
        scanner.close();
    }
}

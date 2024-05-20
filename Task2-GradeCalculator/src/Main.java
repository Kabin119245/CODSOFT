import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("<----Welcome to the Grade Calculator---->");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total number of subjects");
        int totalSubjects = sc.nextInt();

        int totalObtainedMarks = 0;

        for (int i = 0; i < totalSubjects; i++) {
            System.out.println("Enter marks obtained in subject " + (i+1) + ":");
            int marks = sc.nextInt();
            totalObtainedMarks = totalObtainedMarks + marks;
        }

        int totalFullMarls = totalSubjects * 100;

        double percentage = (double) (totalObtainedMarks * 100) / totalFullMarls;

        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >=80 ) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("#################");
        System.out.println("Total Obtained Marks: " + totalObtainedMarks);
        System.out.println("Percentage Obtained " + percentage);
        System.out.println("Grade Obtained: " + grade);
        System.out.println("Thank you");

        sc.close();
    }
}
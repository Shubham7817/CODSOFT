import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        int sum = 0;
        int averagepercentage = 0;
        System.out.println("enter total subjects");
        int subject = sc.nextInt();
        int totalsubjectmarks = subject * 100;
        System.out.println("enter marks for each subject");
        for (int i = 0; i < subject; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("marks for each subject is");
        for (int i = 0; i < subject; i++) {
            System.out.println(marks[i]);
        }
        for (int i = 0; i < subject; i++) {
            sum += marks[i];
        }
        System.out.println("total marks:" + sum);
        averagepercentage = (sum * 100) / totalsubjectmarks;
        System.out.println("average percentage :" + averagepercentage);

        char grade;

        if (averagepercentage >= 80) {
            grade = 'A';
        } else if (averagepercentage >= 60 && averagepercentage < 80) {
            grade = 'B';
        } else if (averagepercentage >= 30 && averagepercentage < 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        switch (grade) {
            case 'A':
                System.out.println("Your grade is " + grade);
                System.out.println("Excellent!,keep it up");
                break;
            case 'B':
                System.out.println("Your grade is " + grade);
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("Your grade is " + grade);
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Your grade is " + grade);
                System.out.println("You failed");
                break;
        }
    }
}


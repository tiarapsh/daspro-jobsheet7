import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = 0, highest = 0, lowest = 100;
        int passCount = 0, failCount = 0;
        String status;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Input grade for student no- " + i + ": ");
            grade = scan.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

              if (grade >= 60) {
                passCount++;
            } else {
                failCount++;
            }
        }
       
        System.out.println("Student passed");
        System.out.println("Highest grade is: " + highest);
        System.out.println("Lowest grade is: " + lowest);
        System.out.println("Number of students passed: " + passCount);
        System.out.println("Number of students failed: " + failCount);
    }
}

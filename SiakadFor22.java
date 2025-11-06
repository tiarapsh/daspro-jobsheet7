import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double grade = 0, highest = 0, lowest = 100;
        int passCount = 0, failCount = 0;
        String status;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter the grade of the " + i + " student: ");
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
       
        System.out.println("The Highest grade : " + highest);
        System.out.println("The Lowest grade : " + lowest);
        System.out.println("Number of students passed: " + passCount);
        System.out.println("Number of students failed: " + failCount);
    }
}

import java.util.Scanner;

public class SiakadFor22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       double grade, highest = 0, lowest = 100;
       for (int i = 1; i <= 10; i++){
            System.out.println("Input grade for student no- " + i + ": ");
            grade = scan.nextDouble();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
       }
       System.out.println("Highest grade is: " + highest);
       System.out.println("Lowest grade is: " + lowest);
    }
}

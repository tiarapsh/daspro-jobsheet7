import java.util.Scanner;

public class SiakadWhile22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade, jml, i = 0;
        System.out.println("Input number of students: ");
        jml = scan.nextInt();

        while ( i <jml){
            System.out.println("Input grade for student no- " + (i+1) + ": ");
             grade = scan.nextInt();

            if (grade < 0 || grade > 100){
                System.out.println("Invalid grade, please input valid grade.");
                continue;
            }

            if (grade > 80 && grade <=100){
                System.out.println("Grade for student no- " + (i+1) + " is A");
                System.out.println("Good, keep the grade! ");
            } else if ( grade > 73 && grade <= 80){
                System.out.println("Grade for student no- " + (i+1) + " is B+");
            } else if ( grade > 65 && grade <= 73){
                System.out.println("Grade for student no- " + (i+1) + " is B");
            } else if ( grade > 60 && grade <= 65){
                System.out.println("Grade for student no- " + (i+1) + " is C+");
            } else if ( grade > 50 && grade <= 60){
                System.out.println("Grade for student no- " + (i+1) + " is C");
            } else if ( grade > 39 && grade <= 50){
                System.out.println("Grade for student no- " + (i+1) + " is D");
            } else {
                System.out.println("Grade for student no- " + (i+1) + " is E");
            }
            i++;
        }
    }
}

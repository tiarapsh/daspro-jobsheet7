import java.util.Scanner;

public class SiakadWhile22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade, jml, i = 0;
        System.out.println("Input number of students: ");
        jml = scan.nextInt();

        while ( i <jml){
            System.out.println("Input grade for student no- " + (i+1) + ": ");
            int nilai = scan.nextInt();

            if (nilai < 0 || nilai > 100){
                System.out.println("Invalid grade, please input valid grade.");
                continue;
            }

            if (nilai > 80 && nilai <=100){
                System.out.println("Grade for student no- " + (i+1) + " is A");
                System.out.println("Good job! ");
            } else if ( nilai > 73 && nilai <= 80){
                System.out.println("Grade for student no- " + (i+1) + " is B+");
            } else if ( nilai > 65 && nilai <= 73){
                System.out.println("Grade for student no- " + (i+1) + " is B");
            } else if ( nilai > 60 && nilai <= 65){
                System.out.println("Grade for student no- " + (i+1) + " is C+");
            } else if ( nilai > 50 && nilai <= 60){
                System.out.println("Grade for student no- " + (i+1) + " is C");
            } else if ( nilai > 39 && nilai <= 50){
                System.out.println("Grade for student no- " + (i+1) + " is D");
            } else {
                System.out.println("Grade for student no- " + (i+1) + " is E");
            }
            i++;
        }
    }
}

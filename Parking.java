import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int category, duration, total = 0;

        do {
            System.out.print("1: Car\n2: Motorcycle\n3: Exit\nInput vehicle category:  ");
            category = scan.nextInt();

            if (category == 1 || category == 2) {
                System.out.println("Input parking duration (hours): ");
                duration = scan.nextInt();

              if (duration > 5) {
                    total += 12500;
                } else if (category == 1) {
                    total += duration * 3000;
                } else if (category == 2) {
                    total += duration * 2000;
                }
            }
        } while (category != 0);

        System.out.println("Total parking fee: Rp" + total);
        scan.close();
    }
}

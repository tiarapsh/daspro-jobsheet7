import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double ticketPrice = 50000;
        double totalSales = 0; 
        int totalTickets = 0;  

        while (true) {
            System.out.print("Enter number of tickets purchased : ");
            int numberOfTickets = scan.nextInt();

            if (numberOfTickets == 0) {
                System.out.println("Transaction completed.");
                break;
            }

            if (numberOfTickets < 0) {
                System.out.println("Invalid number of tickets. Please enter a positive number!");
                continue;
            }

            double totalPrice = numberOfTickets * ticketPrice;
            double discount = 0;

            if (numberOfTickets > 10) {
                discount = 0.15 * totalPrice;
            } else if (numberOfTickets > 4) {
                discount = 0.10 * totalPrice;
            }

            double finalPrice = totalPrice - discount;

            System.out.println("Total price after discount: Rp" + finalPrice);

            totalTickets += numberOfTickets;
            totalSales += finalPrice;
        }

        System.out.println("\n=== Daily Transaction Summary ===");
        System.out.println("Total tickets sold: " + totalTickets);
        System.out.println("Total sales: Rp" + totalSales);

        scan.close();
    }
}

import java.util.Scanner;

public class CafeDoWhile22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int coffee, tea, bread;
        String CustomerName;
        double CoffeePrice= 12000, TeaPrice= 7000, BreadPrice= 20000;

        do{
            System.out.print("Input Customer Name: (Type 'cancel' to exit): ");
            CustomerName = scan.nextLine();
            if (CustomerName.equalsIgnoreCase("cancel")) {
                System.out.println("Order cancelled.");
                break;
            }
            System.out.print("Input number of Coffee: ");
            coffee = scan.nextInt();
            System.out.print("Input number of Tea: ");
            tea = scan.nextInt();
            System.out.print("Input number of Bread: ");
            bread = scan.nextInt();

            double total = (coffee * CoffeePrice) + (tea * TeaPrice) + (bread * BreadPrice);
            System.out.println("Total amount payable: Rp" + total);
            scan.nextLine();
           
        } while (true);
        System.out.println("All transactions completed");
    }
}

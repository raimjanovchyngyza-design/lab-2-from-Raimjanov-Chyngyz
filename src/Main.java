import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int total = 0;
        int items = 0;
        while (choice != 5) {
            System.out.println("------> SIMPLE STORE ");
            System.out.println("1. Mouse--> $20");
            System.out.println("2. Keyboard--> $40");
            System.out.println("3. Headphones--> $50");
            System.out.println("4. Laptop Stand--> $30");
            System.out.println("5. Checkout");
            System.out.print("Choose a product: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                String name = "";
                int price = 0;
                if (choice == 1) {
                    name = "Mouse";
                    price = 20;
                } else if (choice == 2) {
                    name = "Keyboard";
                    price = 40;
                } else if (choice == 3) {
                    name = "Headphones";
                    price = 50;
                } else {
                    name = "Laptop Stand";
                    price = 30;
                }
                System.out.println("You selected: " + name);
                System.out.println("Price: $" + price);
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                if (qty > 0) {
                    int cost = qty * price;
                    total = total + cost;
                    items = items + qty;
                    System.out.println(qty + " x $" + price + " = $" + cost);
                    System.out.println("Added to cart!");
                    System.out.println("Current total: $" + total);
                } else {
                    System.out.println("Invalid quantity.");
                    System.out.println("Quantity must be greater than 0.");
                }
            } else if (choice != 5) {
                System.out.println("Invalid option.");
                System.out.println("Please choose a number from 1 to 5.");
            }
        }
        System.out.println("------->CHECKOUT");
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal: $" + total);
        int disc = 0;
        if (total >= 100) {
            disc = total * 10 / 100;
            System.out.println("You received a 10% discount!");
        }
        int finalTotal = total - disc;
        System.out.println("Discount: $" + disc);
        System.out.println("Final total: $" + finalTotal);
        System.out.print("Enter payment amount: $");
        int pay = sc.nextInt();
        while (pay < finalTotal) {
            System.out.println("Insufficient payment.");
            System.out.println("You still need to pay: $" + (finalTotal - pay));
            System.out.print("Enter payment amount: $");
            pay = sc.nextInt();
        }
        int change = pay - finalTotal;
        System.out.println("Payment successful!");
        System.out.println("--------------------------");
        System.out.println(" SIMPLE STORE");
        System.out.println("------------------------");
        System.out.println("Items purchased: " + items);
        System.out.println("Subtotal: $" + total);
        System.out.println("Discount: $" + disc);
        System.out.println("Final total: $" + finalTotal);
        System.out.println("Payment: $" + pay);
        System.out.println("Change: $" + change);
        System.out.println("-------------------------");
        System.out.println("Thank you for shopping!");
        System.out.println("-----------------------");
    }
}
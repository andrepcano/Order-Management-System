import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date birthdayDate = sdf.parse(sc.next());
        Client client = new Client(name, birthdayDate, email);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");
        String itemStatus = sc.next();
        Order order = new Order(new Date(), OrderStatus.valueOf(itemStatus), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " data: ");
            System.out.println("Product name: ");
            String productName = sc.nextLine();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            order.addItem(new OrderItem(quantity, price));

        }

        System.out.println("Order Sumary: ");
        System.out.println("Order Moment: " + sdf.format(order.getMoment()));
        System.out.println("Order Status: " + order.getStatus());
        System.out.println("Client: " + name + " (" + birthdayDate + ") - " + email);
        System.out.println("Order items: ");
        for (OrderItem item : order.getItems()) {
            System.out.println(item + ", $" + item.getPrice() + ", " + item.getQuantity() + " Subtotal = " + item.getSubTotal());
        }

        System.out.println("Total price: " + order.total());


        sc.close();
    }
}
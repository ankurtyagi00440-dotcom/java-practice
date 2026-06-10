import java.util.*;
class Info {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter product name:");
        String name = sc.nextLine();

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter product quantity:");
        int Quantity = sc.nextInt();
        
        double gst;
        double Finalamount;
        
        double totalPrice = price * Quantity;
        gst =  totalPrice * 18 / 100;
        Finalamount = totalPrice + gst;


        System.out.println("Product Name :" + name);
        System.out.println("Price is:" + price);
        System.out.println("Quantity : " + Quantity);
        System.out.println("Total price  : " + totalPrice);
        System.out.println("Total price after gst is   : " + Finalamount);
        System.out.println("Gst is   : " + gst);

        sc.close();







    }
}
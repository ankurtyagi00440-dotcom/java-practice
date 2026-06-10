import java.util.*;
class Switch {
    public static void main(String[] args) {
        System.out.println("Press any button.");
        Scanner sc = new Scanner(System.in);
       
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println("Pizza");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Pastry");
            break;
            case 4 : System.out.println("CAKE");
            break;
            default : System.out.println("invalid");
        }
        sc.close();
    }

}
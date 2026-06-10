import java.util.*;
class SumQuestion {
    public static void main(String[] args) {
        System.out.print("Enter a :-  ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.print("Enter b:-  ");
        double b = sc.nextDouble();
        double sum = a + b;
        
       
        System.out.println("The sum is " + (a + b));
        sc.close();
    }

}
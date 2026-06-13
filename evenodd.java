import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        

        for(int i=0; i<=n; i++) {
            if(i % 2 == 0) {
                System.out.println("Even numbers are" + n);
            
            }
            else {
                System.out.println("Odd numbers are" + n);
            }
        }
    }
    
}

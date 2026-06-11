import java.util.*;
public class Plus {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%2==0) {
                even++;

            }
            else {
                odd++;
            }
            
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);
    }
    
}

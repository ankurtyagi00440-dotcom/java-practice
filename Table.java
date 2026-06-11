import java.util.*;
public class Table {
    public static void main(String[] args) {
        System.out.println("Multiplication of given table is:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=10; i++) {
            System.out.println( n + " * "  + i + " = " +  i * n);
        }
            sc.close();

    }
    
}

import java.util.*;
public class hi{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int n = sc.nextInt();

        int i =0;
        while(i<=10) {
            System.out.println(n + "*" + i + "=" + i*n);
            i++;
        }
        sc.close();

    }
}

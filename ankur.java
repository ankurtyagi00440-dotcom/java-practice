import java.util.*;
class Ankus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter any number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }

    }
}
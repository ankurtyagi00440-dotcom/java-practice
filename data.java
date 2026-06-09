import java.util.*;
class Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :-");
        String name = sc.nextLine();
        
        System.out.println("Enter your age :-");
        int age = sc.nextInt();
        

        System.out.println("Enter your marks :-");
        double marks = sc.nextDouble();
        

        System.out.println("The name is:-" +name);
        System.out.println("The age is:- " + age);
        System.out.println("The marks are:- " + marks);
        sc.close();

    }
}

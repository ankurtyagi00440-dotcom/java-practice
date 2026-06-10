import java.util.*;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:- ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number:- ");
        double num2 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);


        switch(operator) {
        case '+' : System.out.println("Addition : "  + (num1 + num2));
        break;
        case '-' : System.out.println("Substraction : "  + (num1 - num2));
        break;
        case '*' : System.out.println("Multiplication: "  + (num1 * num2));
        break;
        case '/' : System.out.println("Addition : "  + (num1 / num2));
        break;
        default : System.out.println("Invalid");
        }
        sc.close();


    
    }



}
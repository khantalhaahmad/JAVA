import java.util.Scanner;
public class practise5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();

        System.out.println("Total Sum of two number is" + (a+b));
        System.out.println("Total Subtraction of two number is" + (a-b));
        System.out.println("Total Multiplication of two number is" + (a*b));
        System.out.println("Total Division of two number is" + (a/b));
        System.out.println("Total Modulus of two number is" + (a%b));


    }
}

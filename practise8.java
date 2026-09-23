import java.util.Scanner;
public class practise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = sc.nextInt();

        System.out.println("Post Increment of number is " + (a++));
        System.out.println("Afer Post Increment number is " + a);

        System.out.println("Enter your sceond number");
        int b = sc.nextInt();

        System.out.println("pre increment of number is " + (++b));
        System.out.println("After pre increment number is " + b);
    }
    
}

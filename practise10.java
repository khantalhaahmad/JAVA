import java.util.Scanner;
public class practise10 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = sc.nextInt();

        System.out.println("Enter your second number");
        int b = sc.nextInt();

        System.out.println("a>10 and b<10 is " + (a>10 && b<10));
        System.out.println("a>10 or b<10 is " + (a>10 || b<10));
        System.out.println("!(a>10) is " + !(a>10));
    }
    
}

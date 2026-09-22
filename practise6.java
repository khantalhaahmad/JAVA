import java.util.Scanner;
public class practise6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = sc.nextInt();


        System.out.println("Initial number is " + a);
        System.out.println("After +=5 = "  + (a+=5));

        System.out.println("After -=5 = "  + (a-=5));
        System.out.println("After *=5 = "  + (a*=5));
        System.out.println("After /=5 = "  + (a/=5));
        System.out.println("After %=5 = "  + (a%=5));

    }
    
}

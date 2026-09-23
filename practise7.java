import java.util.Scanner;

public class practise7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = sc.nextInt();

        System.out.println("Initial number is " + a);
        a++;
        System.out.println("After ++ = "  + a);
        a++;
        System.out.println("After ++ = "  + a);
        a--;
        System.out.println("After -- = "  + a);
        a--;
        System.out.println("After -- = "  + a);


    }
    
}

import java.util.Scanner;
public class practise21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number");
        int a = sc.nextInt();

        System.out.println("Enter your 2nd number");
        int b = sc.nextInt();

        System.out.println("Enter your operator");

        char operator= sc.next().charAt(0);

        System.out.println("Selected operator is " + operator);

        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }

    }
    
}

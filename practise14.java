import java.util.Scanner;
public class practise14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number a");
        int a = sc.nextInt();

        System.out.println("Enter your second number b");
        int b = sc.nextInt();

        System.out.println("Enter your third number c");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is greater than b and c");    
        }
        else if(b>a && b>c){
            System.out.println("b is greater than a and c"); 
        }
        else{
            System.out.println("c is greater than a and b");
        }
    }
    
}

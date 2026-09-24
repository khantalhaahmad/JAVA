import java.util.Scanner;
public class practise20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your balance");
        int a = sc.nextInt();

        System.out.println("Enter your withdraw amount");
        int b = sc.nextInt();

        if(b<=a){
             if(b%500==0){
                System.out.println("Transaction Successful");
                System.out.println("Your remaining balance is " + (a-b));
             }   
            else{
                System.out.println("Enter amount in multiple of 500");
            }
             }

        else{
            System.out.println("Insufficient Balance");
        }
        }
    }

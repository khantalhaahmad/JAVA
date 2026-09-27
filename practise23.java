import java.util.Scanner;

public class practise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Balance = 10000;
        System.out.println("Enter your choice");

        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Your balance is " + Balance);
                break;
                case 2:
                    System.out.println("Enter your withdraw amount");
                    int withdraw = sc.nextInt();
                    if (withdraw <= Balance) {
                        if (withdraw % 500 == 0) {
                            System.out.println("Transaction Succesfull");
                            System.out.println("Your remaining balance is " + (Balance - withdraw));
                        }
                        else {
                            System.out.println("Enter amount in multiple of 500");
                        }
                    }
                    else {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                    case 3:
                        System.out.println("Enter your deposit amount");
                        int deposit = sc.nextInt();
                        System.out.println("Transaction Succesfull");
                        System.out.println("Your remaining balance is " + (Balance + deposit));
                        break;
                        
                        case 4:
                            System.out.println("Thank you for using our service");
                            break;
                            default:
                                System.out.println("Invalid choice");
                                break;
        }



    }
    
}

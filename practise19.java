import java.util.Scanner;
public class practise19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Marks");
        int a = sc.nextInt();

        System.out.println("Enter your Attendance percentage");
        int b = sc.nextInt();

        if(a>=40 && b>=75){
            System.out.println("Eligibale For exam");
        }
        else{   
            System.out.println("Not Eligible For exam");
        }
        }
    }
    


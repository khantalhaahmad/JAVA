import java.util.Scanner;

public class fourthclass {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number of Maths: ");
        float math = sc.nextFloat();
        System.out.println("Enter the  number of Science: ");
        float science = sc.nextFloat();
        System.out.println("Enter the  number of English: ");
        float english = sc.nextFloat();
        System.out.println("Enter the  number of Urdu: ");
        float urdu = sc.nextFloat();
        System.out.println("Enter the  number of Islamiat: ");
        float islamiat = sc.nextFloat();
        float total = math + science + english + urdu + islamiat;
        float percentage = (total/500)*100;
        System.out.println("The Total Marks is: " + total);
        System.out.println("The Percentage is: " + percentage);
    }
    
}

import java.util.Scanner;
public class practise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Citizenship");
        String Citizenship = sc.next();

        if(age>=18 && Citizenship.equals("Indian")){
            System.out.println("You are eligible to vote for India");
        }
        else if(age>=18 && Citizenship.equals("Pakistani")){
            System.out.println("You are  eligible to vote for Pakistan");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        
}


}
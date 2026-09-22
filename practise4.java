//import java.util.Scanner;
//public class practise4 {
    //public static void main (String[] args)  {
    
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name");
        //String name = sc.nextLine();

        //System.out.println("Enter your age");
        //int age = sc.nextInt();

        //System.out.println("My name is: " + name + " and I am " + age + " years old.");


    //}
    
//}

import java.util.Scanner;
public class practise4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Your Grade");
        char grade = sc.next().charAt(0);

        System.out.println("your salary");
        double salary = sc.nextDouble();

        System.out.println("Are you a Java Learner?");
        boolean JavaLearner = sc.nextBoolean();


        System.out.println("My name is: " + name + " and I am " + age + " years old.");
        System.out.println("my grade is " + grade);
        System.out.println("my salary is " + salary);
        System.out.println("Am I a Java Learner? " + JavaLearner);
    }
}


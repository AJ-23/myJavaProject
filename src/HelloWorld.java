import java.util.*;
public class HelloWorld {
    public static void main(String [] args){
        System.out.println("Hello World");

        //int a=12;
        //int b=122;
        int sum=1;
        String name="s";

        System.out.println(" ");

        Scanner s1=new Scanner(System.in);

        System.out.println("Enter your name");
        name=s1.nextLine();

        System.out.println("Enter first number");
        int a=s1.nextInt();

        System.out.println("Enter second number");
        int b=s1.nextInt();


        System.out.println("Enter the string");
        String ss=s1.nextLine();

        sum = a+b;

        System.out.println("Hi " +name+ " sum of " + a+ " and "+b+" is "+sum);
        System.out.println(ss);

    }
}

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Even or odd
        System.out.println("-------Even or Odd number------");
        System.out.println("Enter the Number: ");
        float number = sc.nextFloat();

        if (number%2==0) {
            System.out.println(number +" is an even number");
        } else {
            System.out.println(number + " is a odd number");
        }

        // Largest of 3
        System.out.println("------Largest of three numbers----");
        System.out.println("Enter a:");
        float a = sc.nextFloat();
        System.out.println("Enter b:");
        float b = sc.nextFloat();
        System.out.println("Enter c:");
        float c = sc.nextFloat();

        if (a>=b && a>=c) {
            System.out.println(a +" is the largest");
        } else if (b>=c) {
            System.out.println(b +" is the largest");
        } else {
            System.out.println(c + " is the largest");
        }

    }
}

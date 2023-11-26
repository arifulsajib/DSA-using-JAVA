import java.util.Scanner;

public class getInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Area of circle
        System.out.println("Enter the radius of circle:");
        float r = sc.nextFloat();

        Float area = 3.14f * r * r;
        System.out.println("The area of the circle is: "+area);
    }
}

import java.util.Scanner;

public class patterns { 
    /*--------------
    Print Star Pattern
    *
    **
    ***
    ****
    -------------------*/
    public static void printStar(int n){
        for(int i=1;i<=n;i++){
            // single line
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // Big o notation: O(n^2)
    }
    /*--------------
    Print Inverted Star Pattern
    ****
    ***
    **
    *
    -------------------*/
    public static void printInvertedStar(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // single line n-i+1
            for(int j=1; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        // Big o notation: O(n^2)
    }
    /*--------------
    Print Half-pyramid Pattern
    1
    12
    123
    1234
    -------------------*/
    public static void printHalfPyramid(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // single line
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        // Big o notation: O(n^2)
    }
    /*--------------
    Print Character Pattern
    A
    BC
    DEF
    GHIJ
    -------------------*/
    public static void printCharPattern(int n){
        char counterChar = 'A';
        // outer loop
        for(int i=1; i<=n; i++){
            // single line
            for(int j=1; j<=i; j++){
                System.out.print(counterChar);
                counterChar++;
            }
            System.out.println("");
        }
    }
    /*--------------
    Print Hollow Rectangle Pattern
    *****    i=1 1,1 1,2 1,3 1,4 1,5
    *   *    i=2 2,1 2,5
    *   *    i=3 3,1 3,5
    *****    i=4 4,1 4,2 4,3 4,4 4,5
    row i=1 and i=n is border
    column j=1 and j=n is border
    -------------------*/
    public static void printHollowRec(int n){
        // outer loop
        for(int i=1; i<=n; i++){
            // single line
            for(int j=1;j<=n;j++){
                if (i==1||i==n||j==1||j==n) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    /*--------------
    Print Inverted and Rotated Pattern
       *    space 3. n-i  star =line number(i)
      **    space 2
     ***    space 1
    ****    space 0
    -------------------*/
    public static void printInvertedRotate(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            //single line spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // single line Stars
            for(int j=1;j<=i; j++){
                System.out.print("*");
            }

            System.out.println("");
            
        }
    }
    /*----------------
    Print inverted Half Pyramid with Pattern
    12345
    1234
    123
    12
    1
    ------------------*/
    public static void printInvertedHalfPyr(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            // single line
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    /*----------------
    Floyd's Triangle Pattern
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
    ------------------*/
    public static void printFloydTriangle(int n){
        int counter = 1;
        // outer loop
        for(int i=1;i<=n; i++){
            // single line
            for(int j=1; j<=i; j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println("");
        }
    }
    /*----------------
    0-1 Triangle Pattern
    1       (i=1 j=1) 
    01      (i=2 j=1) (i=2 j=2)
    101     (i=3 j=1) (i=3 j=2) (i=3 j=3)
    0101
    10101
    i+j = odd 0
    i+j = even 1
    ------------------*/
    public static void printZerOneTriangle(int n){
        // outer loop 
        for(int i=1; i<=n; i++){
            // single line
            for(int j=1; j<=i; j++){
                int sum=i+j;
                if (sum%2==0) {
                    System.out.print(1);
                } else{
                    System.out.print(0);
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("------Output------");

        // printStar(n);
        // printInvertedStar(n);
        // printHalfPyramid(n);
        // printCharPattern(n);
        // printHollowRec(n);
        // printInvertedRotate(n);
        // printInvertedHalfPyr(n);
        // printFloydTriangle(n);
        printZerOneTriangle(n);
    }
}

import java.util.Scanner;

public class arrays {
    // Linear search O(n)
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if (numbers[i]==key) {
                return i;
            }
        }
        // key not found
        return -1;
    }
    // Binary search must be sorted array ---O(logn) better
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        
        while (start<=end) {
            int mid = (start+end)/2;

            // compare mid with key
            if (numbers[mid]==key) {
                return mid;
            } 
            if (numbers[mid]>key) {//left
                end = mid-1;
            } else{//right
                start= mid+1;
            }
        } 
        // not found
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        // array
        int numbers[] = {2,4,6,8,10,12,15,18};

        // input n search value
        System.out.println("Enter the number to search: ");
        int key = sc.nextInt();

        int indexOfkey = binarySearch(numbers, key);

        if (indexOfkey == -1) {
            System.out.println("Key not found in the array");
        } else{
            System.out.println("Key is at index no: "+indexOfkey);
        }
        
    }
}
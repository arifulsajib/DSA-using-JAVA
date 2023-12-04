public class ArrayProblems {
  // program to print each element of an array
  public static void printArrayInt(int numbers[]){
    for(int i=0;i<numbers.length;i++){
      System.out.print(numbers[i]+ " ");
    }
  }
  // minimum of an array linear search
  public static int minValueArr(int numbers[]){
    int minValue = Integer.MAX_VALUE;
    for(int i=0;i<numbers.length;i++){
      if (numbers[i]<minValue) {
        minValue = numbers[i];
      } 
    }
    return minValue;
  }
  // Maximum value of an array linear search
  public static int maxValueArr(int numbers[]){
    int maxValue = Integer.MIN_VALUE;
    for(int i=0;i<numbers.length;i++){
      if (numbers[i]>maxValue) {
        maxValue = numbers[i];
      } 
    }
    return maxValue;
  }
  // Write a program to reverse an array
  public static void reverseArrays(int numbers[]){
    int first = 0, last=numbers.length-1;
    while (first<last) {
      // swap
      int temp= numbers[last];
      numbers[last]= numbers[first];
      numbers[first]=temp;

      // increase first and decrease last
      first++;
      last--;
    }
  }
  // all pairs in an array O(n^2)
  public static void pairsArray(int numbers[]){
    for(int i=0; i<numbers.length; i++){
      for(int j=i+1; j<numbers.length; j++){
        System.out.print("("+numbers[i]+","+numbers[j]+")");
      }
    }
  }
  // print all subarrays, numbers = [2,4,6,8] subarrays=(2) (2,4) (2,4,6) (2,4,6,8)   (4) (4,6) (4,6,8)  (6) (6,8)   (8)
  public static void printSubArrays(int numbers[]){
    for(int i=0; i<numbers.length;i++){ //start i
      for(int j=i;j<numbers.length; j++){ // end j
        // print start to end
        for(int k=i;k<=j;k++){
          System.out.print(numbers[k]+" ");
        }
        System.out.println("");
      }
    }
  }

  // Given an integer array nums, find the subarray with the largest sum, and return its sum. Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6  --- O(n^3)
  public static void LargestSubarraySum(int numbers[]){
    // largest
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<numbers.length;i++){
      for(int j=i; j<numbers.length; j++){
        int sum = 0;
        for(int k=i; k<=j; k++){
          sum = sum+numbers[k];
          System.out.print(numbers[k]+ " ");
        }
        System.out.println("sum= " + sum);
        if (sum>largest) {
          largest=sum;
        }
      }
    }
    System.out.println("Largest Sum is: "+largest);
  }
  // Given an integer array nums, find the subarray with the largest sum, and return its sum. prefix array method2 O(n^2)
  public static void LargestSubarraySum2(int numbers[]){
    // calculate prefix array:
    int prefix[] = new int[numbers.length];
    prefix[0]=numbers[0];
    for(int i=1; i<numbers.length;i++){
      prefix[i]= prefix[i-1]+numbers[i];
    }

    int largest = Integer.MIN_VALUE;
    int sum=0;
    // outer loop
    for(int i=0; i<numbers.length; i++){//start
      for(int j=i;j<numbers.length; j++){//end
        if (i==0) {
          sum=prefix[j];
        } else{
          sum=prefix[j]-prefix[i-1]; //subarray sum = prefix[end] - prefix[start-1]
        }
        if (sum>largest) {
          largest=sum;
        }
      }
    }
    System.out.println("Largest sum is: "+largest);
  }
  // Given an integer array nums, find the subarray with the largest sum, and return its sum.Kadanes algo method3 O(n) important
  public static void LargestSubarraySum3(int numbers[]){
    int maxSum = Integer.MIN_VALUE;

    // kadanes algo not for array contains all negetive numbers
    // check if all numbers are negetive
    boolean flags = true;
    for(int i=0;i<numbers.length;i++){
      if (numbers[i]>0) {
        flags = false;
        maxSum=0;
      }else{
        maxSum=Math.max(maxSum, numbers[i]);
      }
    }

    if (!flags) {
      // kadanes algo
      int currentSum = 0;
      for(int i=0; i<numbers.length; i++){
        currentSum = currentSum+numbers[i];
        if (currentSum<0) {
          currentSum=0;
        }
        maxSum=Math.max(maxSum, currentSum);
      }
    }

    

    System.out.println("Max sum is: "+maxSum);
  }

  //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  
  // Search in Rotated Sorted Array using binary search Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4 --All values of nums are unique.  --nums is an ascending array that is possibly rotated.
  public static void main(String[] args) {
      // array
      int numbers[] = {2,4,6,8,10,12,15,18};
      // int numbers[] = {-2,-4,-6,-8,-10,-12,-15,-18};

      // int minValue = minValueArr(numbers);
      // int maxValue = maxValueArr(numbers);

      // System.out.println("Min Value of the array is: "+minValue);
      // System.out.println("Max Value of the array is: "+maxValue);

      // reverseArrays(numbers);
      // pairsArray(numbers);
      // printSubArrays(numbers);
      // LargestSubarraySum(numbers);
      // LargestSubarraySum2(numbers);
      LargestSubarraySum3(numbers);


      // print array
      // printArrayInt(numbers);
    }
}
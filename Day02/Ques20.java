import java.util.Scanner;

class Ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter array size:");
        int size = sc.nextInt();

          int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

          double median = findMedian(arr, size);
        System.out.println("Median is: " + median);

          sc.close();
    }

      public static double findMedian(int[] arr, int size) {
         if (size % 2 != 0) {
            return arr[size / 2];
        }
           else {
            int mid1 = size / 2 - 1;
            int mid2 = size / 2;
            return (arr[mid1] + arr[mid2]) / 2.0;
        }
    }
}

/*Question 20:
Find the median of a sorted array.
    Test Case: 1
  ----------------
   Array size: 6
   Elements are: 1, 2, 3, 4, 5, 6
   Median is: 3.5
  Test Case: 2
  ----------------
   Array size: 5
   Elements are: 1, 2, 3, 4, 5
   Median is: 3*/
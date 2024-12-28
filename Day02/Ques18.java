 import java.util.Scanner;
 public class Ques18 {
	 public static void main(String[] args) {
          
		   Scanner sc = new Scanner(System.in);
          
		  System.out.println("Enter size ");
		 int size = sc.nextInt();
     
          int arr[] = new int[size];
		     
		  System.out.println("Enter "+size+" Element");
		 for (int i=0;i<size;i++)
		 {
              arr[i] = sc.nextInt();
		 }
           System.out.println("Maximum element: " + findMaximum(arr));
		   sc.close();
    }

      public static int findMaximum(int[] arr) {
           if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

          int maxElement = arr[0];

         for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

   
}

/*Question 18:
a.Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6
 
b.Find Maximum Element in an Array.
 Input as: 6 3 2 1 5 5 4
 Output as: Max is: 6*/

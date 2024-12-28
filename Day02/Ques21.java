import java.util.Scanner;
class Ques21 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);

         System.out.println("Enter array size:");
        int size = sc.nextInt();

          int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
		{
            arr[i] = sc.nextInt();
        }
		findEvenandOddPositionElement(arr);


		sc.close();
	}
	public static void findEvenandOddPositionElement(int[] arr) {
           System.out.println("Elements at even indices:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {  // Even index
                System.out.print(arr[i] + " ");
            }
        }

          System.out.println("\nElements at odd indices:");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {  // Odd index
                System.out.print(arr[i] + " ");
            }
        }
    }
}
/*Question 21:
 Write java method named findEvenandOddPositionElement that print
 all the elements which is present at even index and also in odd index.*/

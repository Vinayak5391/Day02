import java.util.Scanner;

class Ques12 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
           

		 System.out.println("Enter size ");
		 int size = sc.nextInt();
     
          int arr[] = new int[size];
		 System.out.println("Enter "+size+" Element");
		 for (int i=0;i<size;i++)
		 {
              arr[i] = sc.nextInt();
		 }


		 double avg = 0;
           for (int i=0;i<size;i++)
           
         avg += arr[i];
            avg = avg / size;

         System.out.println("Greater than avg :");
			for (int i = 0; i < size; i++)
            if (arr[i] > avg) 
			  System.out.print (arr[i] + " ");
			sc.close();
		 }
		 }

/*Question 12:
 Count Elements Greater than Average.
 Write a program to count how many elements in the array
 {10, 20, 30, 40, 50}
 are greater than the average of all the elements.
 */
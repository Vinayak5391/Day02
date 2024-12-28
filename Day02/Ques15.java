import java.util.*;
class Ques15
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
		   
        int n=0;
		int count = 0;
		  
	   for(int i=2; i<size; i++) {
        if(n%i==0)
            count++;
    } 
	System.out.println(count);
	sc.close();
		}  
		
}

/*Question 15:
 Write a program to count how many elements in an array
 {2, 3, 4, 5, 6, 7, 8, 9, 10} are prime numbers.
 Example: 2, 3, 5, and 7 are prime.*/
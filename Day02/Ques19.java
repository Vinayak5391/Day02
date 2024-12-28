import java.util.Scanner;
class Ques19 
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

		   int n = arr.length;  
		   System.out.println("Enter the Element to find :");
		   int num = sc.nextInt();
         boolean found = false;
		  for (int i=0;i<n;i++)
		  {
			  if (arr[i]== num)
			  {
				  System.out.println("Element found at index :"+ i);
				  found = true;
				 break;
			  } 

                 
		  }

		  if (!found)
		  {
           System.out.println("Element not found :");
			 
		  }
		  sc.close();

			
     }
}
/*Question 19:
Search for a given Element in an Array if present then print
   "Element found at index : ", if not present print "Element not found"
    Input as: 1 4 3 5 2 6 5
    Enter searching element: 5
    Output: Element found at index 6
 
     Input as: 1 4 3 5 2 6
    Enter searching element: 7
    Output: Element not found*/
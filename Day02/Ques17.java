import java.util.Scanner;

class Ques17 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
           

		 System.out.println("Enter size ");
		 int size = sc.nextInt();
     
          int arr[] = new int[size];
		  //int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		  
		  System.out.println("Enter "+size+" Element");
		 for (int i=0;i<size;i++)
		 {
              arr[i] = sc.nextInt();
		 }
          
        System.out.println("Duplicate elements in given array: ");  
        
        for(int i = 0; i < arr.length; i++)
			{  
            for(int j = i + 1; j < arr.length; j++) 
				{  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]+ " ");  
            }  
        }
		sc.close();
	}
}

/*Question 17:
Count and Print Duplicate Elements.
 Write a program to count the number of duplicate elements
 in an array {1, 2, 2, 3, 4, 4, 5} and print those duplicate elements.*/
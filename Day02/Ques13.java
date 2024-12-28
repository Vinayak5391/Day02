import java.util.Scanner;
 class Ques13 
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
	
for (int i=0;i<n;i++)
{ 
	 int count=0;

	for (int j=0;j<n;j++)
	{
		if (arr[i]== arr[j])
		{
			count++;
		}
	}
	if (count >n/2)
	{
		System.out.println(arr[i]);
	} 
		
}
System.out.print("No majority");
sc.close();
   } 
   }
/*Question 13: Find the Majority element.
 Print the Element which appeared More than n/2 Times.
 [n is length of the array]
 
 Write a program to find an element in an array
 {3, 3, 4, 2, 4, 4, 2, 4, 4}
 that appears more than n/2 times. If no such element exists,
 display "No majority element."*/
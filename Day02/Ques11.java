import java.util.Scanner;

class Ques11 
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
           int Evencount = 0; 
           int Oddcount = 0;
		 for (int i=0;i<size;i++)
		 {
			 if((arr[i] & 1) == 1){
		      Oddcount++;
		 }  else{
          Evencount++;
		 }
            
		 }System.out.println("Even number : "+Evencount+ "Oddnumber "+ Oddcount);
	sc.close();	 
	}
}

/* Count Odd and Even Numbers
 Given an array {1, 2, 3, 4, 5, 6}, write a program to count how many
 elements are odd and how many are even.*/
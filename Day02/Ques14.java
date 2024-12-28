import java.util.*;
 class Ques14 
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
		 int k =2;
		  int count = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
 
        for (int i=0;i<n; i++) {
 
              if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else {
                mp.put(arr[i], 1);
            }
        }
 
        for (Map.Entry<Integer, Integer> i :
             mp.entrySet()) {
 
              if (i.getValue() == k) {
                if (mp.containsKey(i.getKey() * 2)
                    == false) {
                    count++;
                }
            }
        }
         System.out.println(count);
		 sc.close();
    }
		 }

/*Question 14: Count Elements Appearing Exactly k Times.

 Write a program to count how many elements appear exactly 2 times
 in an array {1, 2, 2, 3, 4, 4, 5, 5}.
 Example: 2, 4, and 5 each appear exactly twice.
 If k time elements are not found then print "No element found".*/
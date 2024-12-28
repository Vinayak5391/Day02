import java.util.*;
class GfG {
    static ArrayList<Integer> findDistinct(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

             int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

                 if (i == j)
                res.add(arr[i]);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
      
        ArrayList<Integer> res = findDistinct(arr);
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}

/*Question 16:
Count and Print Distinct Elements.
 Write a program to count the number of distinct/unique/non repeated
 elements in an array {1, 2, 2, 3, 4, 4, 5} and print those unique
 elements.*/

/*Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. 
 If no such positive integer exists, return -1.
Note that the returned integer should fit in 32-bit integer, if there is a valid answer but it does not fit in 32-bit integer, return -1.

Example 1:

Input: n = 12
Output: 21

Example 2:

Input: n = 21
Output: -1


Constraints:

    1 <= n <= 231 - 1 */



import java.util.*;
public class Array5 {
	public static int nextGreaterElement(int n) {
        String str=Integer.toString(n);
        char[] arr=str.toCharArray();
        
        //1. Find the first dip
        int i=arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1){
            return -1;
        }
        
        // Find just greater than ith index element
        int k=arr.length-1;
        while(arr[i]>arr[k]){
            k--;
        }
        
        //swap from i and k
        char temp=arr[i];
        arr[i]=arr[k];
        arr[k]=temp;
        
        //Concatenate from 0 to i index
        String res="";
        for(int j=0;j<=i;j++){
            res+=arr[j];
        }
        
        //Concatenate from k to i+1 index (reverse order)
        for(int j=arr.length-1;j>i;j--){
            res+=arr[j];
        }
        
        return Integer.parseInt(res);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(nextGreaterElement(n));
	}

}

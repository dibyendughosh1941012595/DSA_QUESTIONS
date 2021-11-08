/*You are given an integer array arr.
We split arr into some number of chunks (i.e., partitions), and 
individually sort each chunk. After concatenating them, 
the result should equal the sorted array.
Return the largest number of chunks we can make to sort the array.

Example 1:
Input: arr = [5,4,3,2,1]
Output: 1
Explanation:
Splitting into two or more chunks will not return the required result.
For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3], which isn't sorted.

Example 2:
Input: arr = [2,1,3,4,4]
Output: 4
Explanation:
We can split into two chunks, such as [2, 1], [3, 4, 4].
However, splitting into [2, 1], [3], [4], [4] is the highest number of chunks possible.

 

Constraints:

    1 <= arr.length <= 2000
    0 <= arr[i] <= 108 */


import java.util.Scanner;
public class Array10 {
	 public static int maxChunksToSorted(int[] arr) {
	        int n=arr.length;
	         //1. generate right min
	         int[] rmin=new int[n+1];
	         rmin[n]=Integer.MAX_VALUE;
	        for(int i=n-1;i>=0;i--){
	            rmin[i]=Math.min(rmin[i+1],arr[i]);
	        }
	        
	        //2.iterate on array and manage left mas as weel as count the chunks
	        int leftmax=Integer.MIN_VALUE;
	        int count=0;
	        for(int i=0;i<n;i++){
	            leftmax=Math.max(leftmax,arr[i]);
	            if(leftmax<=rmin[i+1]){
	                count++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.println(maxChunksToSorted(arr));

	}

}

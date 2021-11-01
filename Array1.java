/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
*/


import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		/* METHOD-1
		for(int i=0;i<n;i++) {
			arr[i]=arr[i]*arr[i];
		}
		Arrays.sort(arr);
		for(int e:arr) {
			System.out.print(e+" ");
		} */
		
		/*METHOD - 2*/
		
        int l=0;
        int r=n-1;
        int k=r;
        int ans[]=new int[n];
        while(l<=r) {
        	if(Math.abs(arr[l])>Math.abs(arr[r])) {
        		ans[k]=arr[l]*arr[l];
        		l++;
        	}
        	else {
                ans[k] = arr[r]*arr[r];
                r--;
            }
            k--;
        }
        for(int e:ans) {
        	System.out.print(e+" ");
        }
        
	}

}

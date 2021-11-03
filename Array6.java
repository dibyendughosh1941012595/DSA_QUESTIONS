/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 

Constraints:

    n == nums.length
    1 <= n <= 5 * 104
    -231 <= nums[i] <= 231 - 1 */


import java.util.*;
public class Array6 {
	public static int majorityElement(int[] nums) {
        int n=nums.length;
        int major=0;
        int count=0;
        for(int i=0;i<n;i++){
           if(count==0){
               major=nums[i];
               count=1;
           }
            else{
                if(nums[i]==major){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(nums[i]==major){
                count1++;
            }
        }
        if(count1>n/2){
            return major;
        }
        else{
            return -1;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(majorityElement(arr));

	}

}

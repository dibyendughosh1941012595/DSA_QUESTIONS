/*Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]

 

Constraints:

    1 <= nums.length <= 5 * 104
    -109 <= nums[i] <= 109 */


import java.util.*;
public class Array7 {
	public static  List<Integer> majorityElement(int[] nums) {
        int n=nums.length/3;
        List<Integer> arr=new ArrayList<Integer>();
        int num1=-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        for(int ele:nums){
            if(ele==num1){
                count1++;
            }
            else if(ele==num2){
                count2++;
            }
            else if(count1==0){
                num1=ele;
                count1=1;
            }
            else if(count2==0){
                num2=ele;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int c1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }
        }
        
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num2){
                c2++;
            }
        }
        
        if(c1>n){
            arr.add(num1);
        }
        if(num1!=num2){
           if(c2>n){
            arr.add(num2);
        } 
        }
        
        
        return arr;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        List<Integer> ans=majorityElement(arr);
        for(int ele:ans) {
        	System.out.println(ele);
        }
	}

}

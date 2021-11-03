

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

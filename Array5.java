

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

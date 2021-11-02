/* https://codeforces.com/contest/1501/problem/B */

 import java.util.*;
public class Array4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=arr[n-1];
		int b[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			if(temp!=0||arr[i]!=0) {
				b[i]=1;
				temp=Math.max(temp, arr[i]);
				temp--;
			}
			else {
				temp=arr[i];
			}
		}
		for(int e:b) {
			System.out.print(e+" ");
		}
		System.out.println();
		t--;
		}

	}

}

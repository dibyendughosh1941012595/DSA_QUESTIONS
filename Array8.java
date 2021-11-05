/*Given an array of size n and a number k, find all elements that appear more than n/k times
Given an array of size n, find all elements in array that appear more than n/k times. 
For example, if the input arrays is {3, 1, 2, 2, 1, 2, 3, 3} and k is 4, 
then the output should be [2, 3]. Note that size of array is 8 (or n = 8), 
so we need to find all elements that appear more than 2 (or 8/4) times. 
There are two elements that appear more than two times, 2 and 3. */

import java.util.*;
public class Array8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int x = n / k;
        HashMap<Integer, Integer> y = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!y.containsKey(arr[i])) {
                y.put(arr[i], 1);
            }
            else {
                int count = y.get(arr[i]);
                y.put(arr[i], count + 1);
            }
        }
        for (Map.Entry m : y.entrySet()){
            Integer temp = (Integer)m.getValue();
            if (temp > x)
                System.out.println(m.getKey());
        }
    }
  
	}


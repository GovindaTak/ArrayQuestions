package main;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicateFromSortedArray {
	
	public static int[] removeDuplicate(int[] arr)
	{
		Arrays.sort(arr);
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==0) {arr[index++]=arr[i];continue;}
			if(arr[i]==arr[i-1])continue;
			arr[index++]=arr[i];
		}
		return Arrays.copyOfRange(arr, 0, index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			int[] arr= {2,3,4,6,3,4,7,9,0};
			System.out.println(Arrays.toString(removeDuplicate(arr)));
		}
	}

}

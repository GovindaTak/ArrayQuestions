package main;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayBySteps {
	
	public static void rightRotation(int arr[],int steps)
	{
		if(steps==0)return;
		reverseArray(arr,0,arr.length-1);
		if(steps>arr.length)steps=steps%arr.length;
		reverseArray(arr,0,steps-1);
		reverseArray(arr,steps,arr.length-1);
		
	}
	public static void leftRotation(int arr[],int steps)
	{
		if(steps==0)return;
		
		if(steps>arr.length)steps=steps%arr.length;
		reverseArray(arr,0,steps-1);
		reverseArray(arr,steps,arr.length-1);
		reverseArray(arr,0,arr.length-1);
		
	}
	public static void reverseArray(int[] arr,int left,int rigth)
	{
		while(left<rigth)
		{
			int temp=arr[left];
			arr[left++]=arr[rigth];
			arr[rigth--]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc=new Scanner(System.in))
		{
			int arr[]= {1,2,3,4,5};
			System.out.println("Enter the steps to rotate array :- ");
			int steps=sc.nextInt();
			rightRotation(arr,steps);
			System.out.println("after right rotation :- "+Arrays.toString(arr));
			leftRotation(arr,steps);
			System.out.println("after left rotation :- "+Arrays.toString(arr));
		}
	}

}

package main;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static int[] mergeArray(int[] a,int[] b)
	{
		Arrays.sort(a);
		Arrays.sort(b);
		int aindex=0;
		int bindex=0;
		int k=0;
		int c[]=new int[a.length+b.length];
		while(aindex<a.length&&bindex<b.length)
		{
			if(a[aindex]<b[bindex])
				c[k++]=a[aindex++];
			else
				c[k++]=b[bindex++];
		}
		while(aindex<a.length)
			c[k++]=a[aindex++];
		while(bindex<b.length)
			c[k++]=b[bindex++];
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,6,7,3,5,34,67,2};
		int b[]= {4,8,3,20,56};
		System.out.println(Arrays.toString(mergeArray(a,b)));
	}

}

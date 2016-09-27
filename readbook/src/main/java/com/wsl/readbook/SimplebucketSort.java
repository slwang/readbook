package com.wsl.readbook;

public class SimplebucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplebucketSort sbs = new SimplebucketSort();
		int array[] = new int[] {8, 100, 50, 22, 15, 6, 1, 1000, 999, 0};
		sbs.bucketSort(array);

	}
	
	
	private void bucketSort(int array[]){
		System.out.println("输入的数据：");
		int book[] = new int[1001];
		for (int i=0; i<=1000; i++)
			book[i] = 0;
				
		for (int i =0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
			book[array[i]]++;
		}
		System.out.println();
		System.out.println("排序后的数据：");
		
		for (int j=1000; j>=0; j--){
			for (int k =1; k<=book[j]; k++)
				System.out.print(j+" ");
		}
		
	}
	

}

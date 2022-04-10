package com.PayUmoney.Ques1;

import java.util.Scanner;

public class Transaction {
	int findTarget(int[] arr, int target, int size) {
		int sum=0;
		for (int i=0;i<size;i++) {
			sum=sum+arr[i];
			if(target<=sum) {
				return i+1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Transaction tr=new Transaction();
		
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values of array");
		for (int i=0;i<size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numtarget=sc.nextInt();
		int j=0;
		while(j<numtarget) {
			System.out.println("Enter the value of target");
			int target=sc.nextInt();
			int trans=tr.findTarget(arr,target,size);
			if (trans==0) {
				System.out.println("Given target is not achieved");
			} else {
				System.out.println("Target achieved after "+ trans+" transactions");
			}
			j++;
		}
		sc.close();
		
	}

}

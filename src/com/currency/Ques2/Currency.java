package com.currency.Ques2;

import java.util.Arrays;
import java.util.Scanner;


public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i=0;i<size; i++) {
			try {
				arr[i]=sc.nextInt();
				if (arr[i]==0) {
					throw new Exception( );
				}
			}
			catch (Exception ex) {
				System.out.println("the denomination cannot be 0 enter a valid value");	
				arr[i]=sc.nextInt();
			}	
		}
		System.out.println("Enter the amount you want to pay");
		int totalamt=sc.nextInt();
		int temp=totalamt;
		Arrays.sort(arr);
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i=size-1; i>=0; i--) {
			int j=0;
			j=temp/arr[i];
			temp=temp%arr[i];
			if(j>0) {
				System.out.println(arr[i] + ":" + j);
			}
			if (temp==0) {
				break;
			}
		}
		if (temp>0) {
			System.out.println("total amount cannot be paid with the given denomination");
		}
		
		sc.close();

	}

}

package com.myacm.exercise;

import java.util.Scanner;

public class acm_1003_Max_Sum {
	public static void main(String[] args) {
		acm_1003_Max_Sum acm = new acm_1003_Max_Sum();
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if (t <= 20 && t >= 1) {
			for (int i = 1; i <= t; i++) {
				int num = s.nextInt();
				int[] a = new int[num];
				int j = 0;
				while(num > j){
					a[j] = s.nextInt();
					j++;
				}
				System.out.println("Case " + i + ":");
				
				System.out.println(acm.getMax(a) + " " + (acm.startIndex + 1) + " " + (acm.endIndex + 1));
				if(i != t)
					System.out.println();
			}
		}
	}
	int startIndex, endIndex;
	
	private int getMax(int[] a){
		int max = a[0];
		int temp = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a.length; j++){
				temp += a[j];
				if(max < temp){
					max = temp;
					startIndex = i;
					endIndex = j;
				}
			}
			temp = 0;
		}
		return max;
	}
}

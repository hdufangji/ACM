package com.myacm.exercise;

import java.util.Scanner;

public class acm_1003_Max_Sum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		if (t <= 20 && t >= 1) {
			for (int i = 1; i <= t; i++) {
				int num = s.nextInt();
				int[] a = new int[num];
				mStart = new int[num];
				mEnd = new int[num];
				int j = 0;
				while(num > j){
					a[j] = s.nextInt();
					j++;
				}
				System.out.println("Case " + i + ":");
				
				System.out.println(getMax(a) + " " + (startIndex + 1) + " " + (endIndex + 1));
				if(i != t)
					System.out.println();
			}
		}
	}
	
	static int[] mStart;
	static int[] mEnd;
	static int startIndex, endIndex;
	//穷举
	private static int getMax(int[] a){
		Integer start = 0, end = 0;
		int max = a[0];
		for(int i = 0; i < a.length; i++){
			int temp = getMaxNumAtI(a, i);
			if(max < temp){
				max = temp;
				startIndex = mStart[i];
				endIndex = mEnd[i];
			}
		}
		return max;
	}

	private static int getMaxNumAtI(int[] a, int index) {
		int max = a[index];
		int temp = 0;
		for(int i = index; i < a.length; i++){
			temp += a[i];
			if(max < temp){
				max = temp;
				mStart[index] = index;
				mEnd[index] = i;
			}
		}
		return max;
	}
}

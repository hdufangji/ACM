package com.myacm.exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class acm_1003_Max_Sum {
	public static void main(String[] args) {
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
				
//				System.out.println(a + " + " + b + " = " + a.add(b).toString());
				if(i != t)
					System.out.println();
			}
		}
	}
	
	private static int sum(int[] a){
		
		return 0;
	}
}

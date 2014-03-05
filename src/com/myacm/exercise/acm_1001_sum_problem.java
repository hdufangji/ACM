package com.myacm.exercise;

import java.util.Scanner;

public class acm_1001_sum_problem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNextInt()){
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("" + sum(a));
			System.out.println();
			System.out.print(sum(b));
		}
	}
	
	private static int sum(int num){
		if(num > 0){
			return num + sum(num - 1);
		}
		return 0;
	}
}

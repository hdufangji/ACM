package com.myacm.exercise;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class acm_1058_humble_numbers {
	public static void main(String[] args) {
//		acm_1058_humble_numbers acm = new acm_1058_humble_numbers();
//		LinkedList<Long> l = new LinkedList<Long>();
//		l.add(2L);
//		l.add(1L);
//		l.add(0L);
//		l.add(333L);
//		l.add(0L);
//		Collections.sort(l, acm.new com());
//		System.out.println(l.toString());
		
		Scanner sc = new Scanner(System.in);
		acm_1058_humble_numbers acm = new acm_1058_humble_numbers();
		acm.calHumbleNumber();
		Collections.sort(acm.list, acm.new com());
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)
				break;
			
			if(n % 100 == 11 || n % 100 == 12 || n % 100 == 13)
				System.out.println("The " + n + "th humble number is " + acm.getHumbleNumber(n) + ".");
			else if(n % 10 == 1)
				System.out.println("The " + n + "st humble number is " + acm.getHumbleNumber(n) + ".");
			else if(n % 10 == 2)
				System.out.println("The " + n + "nd humble number is " + acm.getHumbleNumber(n) + ".");
			else if(n % 10 == 3)
				System.out.println("The " + n + "rd humble number is " + acm.getHumbleNumber(n) + ".");
			else
				System.out.println("The " + n + "th humble number is " + acm.getHumbleNumber(n) + ".");
		}
	}

	private LinkedList<Long> list = new LinkedList<Long>();
	
	private long getHumbleNumber(int n) {
		return list.get(n - 1);
	}
	
	private long h_2 = 2L,
						h_3 = 3L,
						h_5 = 5L,
						h_7 = 7L;
	private final long MAX_NUMBER = 2000000000;
	
	private void calHumbleNumber(){
		long temp_h2, temp_h3, temp_h5, temp_h7;
		for(int a = 0; a < 32; a++){
			temp_h2 = power(h_2, a);
			
			if(temp_h2 > MAX_NUMBER)
				break;
			else
				list.add(temp_h2);
			
			for(int b = 0; b < 32; b++){
				temp_h3 = power(h_3, b);
				
				long re_h3 = temp_h2 * temp_h3;
				if(re_h3 > MAX_NUMBER)
					break;
				else if(re_h3 != 1)
					list.add(re_h3);
				
				for(int c = 0; c < 32; c++){
					temp_h5 = power(h_5, c);
					
					long re_h5 = temp_h2 * temp_h3 * temp_h5;
					if(re_h5 > MAX_NUMBER)
						break;
					else if(re_h5 != 1)
						list.add(re_h5);
					
					for(int d = 0; d < 32; d++){
						temp_h7 = power(h_7, d);
						
						long re_h7 = temp_h2 * temp_h3 * temp_h5 * temp_h7;
						
						if(re_h7 > MAX_NUMBER)
							break;
						else if(re_h7 != 1)
						list.add(re_h7);
					}
				}
			}
		}
		System.out.println(list.toString());
	}
	
	private long power(long a, int p){
		long temp = 1;
		if(p == 0)
			return temp;
		
		for(int i = 1; i <= p; i++){
			temp *= a;
		}
		return temp;
	}
	
	class com implements Comparator<Long>{

		@Override
		public int compare(Long o1, Long o2) {
			int flag = o1.compareTo(o2);
			if(flag == 0){
				return o1.compareTo(o2);
			}else
				return flag;
		}
		
	}
}

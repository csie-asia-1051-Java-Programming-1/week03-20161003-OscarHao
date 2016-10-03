package ex;

import java.util.*;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021032 鄭權豪
 */

public class ex04_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		long n=sca.nextLong();
		int sum=0;
		while(n>0){
			sum=(int)(sum+n%10);
			n=n/10;
		}
		System.out.print(sum);
		}

	}



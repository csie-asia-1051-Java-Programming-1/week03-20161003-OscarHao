package ex;

import java.util.*;

/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021032 鄭權豪
 */

public class ex03_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		char ch1 = sca.next().charAt(0);
		int n = ch1;
		if (n >= 65 && n < 97) {
		 ch1=(char)(ch1+32);
		 System.out.print(ch1);
		}else{
			n=ch1;
			ch1=(char)(ch1-32);
		
		
		}
		System.out.print(ch1);

	}

}

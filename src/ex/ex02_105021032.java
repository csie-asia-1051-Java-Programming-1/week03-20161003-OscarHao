package ex;
import java.util.*;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021032 鄭權豪
 */

public class ex02_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		char ch1=sca.next().charAt(0);
		int n=ch1-'a';
		if(n>=0 && n<26){
			System.out.print("小寫");
		}else{
			n=ch1-'A';
			if(n>=0 && n<26);
			System.out.print("大寫");
			
		}
		

	}

}

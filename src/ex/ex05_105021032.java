package ex;
import java.util.*;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021032 鄭權豪
 */

public class ex05_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		int a=sca.nextInt();
		if(a>0 && a%2==0){
			System.out.print("偶數");
		}else{
			if(a>0 && a%2==1)
			System.out.print("奇數");
		}

	}

}

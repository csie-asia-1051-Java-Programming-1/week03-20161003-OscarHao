package ex;
import java.util.*;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021032 鄭權豪
 */

public class ex01_105021032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca=new Scanner(System.in);
		String str=sca.next();
		char[] data=str.toCharArray();
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}
	}
}



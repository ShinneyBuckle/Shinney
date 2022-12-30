package week1.day2;

import java.util.Iterator;

public class Fibinocci {
	public static void main(String[] args) {
		int firstnum=0,secnum=1,sum;
		System.out.println(firstnum);
		System.out.println(secnum);//0
		for (int i = 1; i <=11; i++) {
			sum=firstnum+secnum;
			System.out.println(sum);//1
			firstnum=secnum;
			secnum=sum;
			
			
		}
			
		}
	}



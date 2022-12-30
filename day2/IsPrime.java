package week1.day2;

public class IsPrime {
public static void main(String[] args) {
	int Number=47;
	for (int i = 2; i <= Number-1; i++) {
		if (Number%i==0) {
			System.out.println("The given Number is Non Prime");
			break;
		} else {
System.out.println("The given number is Prime");
break;
		}
}
}
}
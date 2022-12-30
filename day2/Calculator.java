package week1.day2;

public class Calculator {
public int addThreeNumbers(int num1,int num2,int num3) {

return num1+num2+num3;
}
public int multiplyTwoNo(int a,int b) {
	
return a*b;
}

 void divideTwoNo() {
	int a=50;
	int b=10;
	System.out.println("Division :" +a/b);

}
public static void main(String[] args) {
	Calculator rv = new Calculator();
	int addThreeNumbers = rv.addThreeNumbers(5, 100, 20);
	int multiplyTwoNo = rv.multiplyTwoNo(10, 20);
	System.out.println("Addition :" +addThreeNumbers);
	System.out.println("Subtraction :"+multiplyTwoNo);
	rv.divideTwoNo();
}
}


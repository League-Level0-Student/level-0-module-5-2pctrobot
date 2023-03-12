package _01_algorithms._2_fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	long number0 = 0;
	long number1 = 1;
	long sum = 0;
	System.out.println(number0);
	System.out.println(number1);
	for (int i = 0; i < 91; i++) {
	sum = number0 += number1;
	number0=number1;
	number1=sum;
	System.out.println(sum);
		}
}
}

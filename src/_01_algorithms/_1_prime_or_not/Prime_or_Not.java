package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime_or_Not {
public static void main(String[] args) {
	String prime = JOptionPane.showInputDialog("Please input a number.");
	int number = Integer.parseInt(prime);
	boolean isPrime = true;
	for (int i = 2; i < number; i++) {
	if(number % i == 0) {
		isPrime = false;
	}else {
		
	}
	
	}
	if(isPrime == true) {
		JOptionPane.showMessageDialog(null, "This number is prime.");
	}else {
		JOptionPane.showMessageDialog(null, "This number is not prime.");
	}
}
}

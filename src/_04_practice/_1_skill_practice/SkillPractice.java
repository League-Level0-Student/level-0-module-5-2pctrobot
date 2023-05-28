package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

skill1();
skill2();
skill3();
skill4();
skill5();
}

private static void skill5() {
	String school = JOptionPane.showInputDialog("What school do you go to?");
	JOptionPane.showMessageDialog(null, school + " is a great school!");
}

private static void skill4() {
	String sandiego = JOptionPane.showInputDialog("What city do you live in?");
	if(sandiego.equals("San Diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city.");
	}else {
		JOptionPane.showMessageDialog(null, "Move to San Diego.");
	}
	String cars = JOptionPane.showInputDialog("How many cars do your family have.");
	int car = Integer.parseInt(cars);
	if(car == 0) {
		JOptionPane.showMessageDialog(null, "I bet you use public transportation.");
	}else if(car == 1){
		String model = JOptionPane.showInputDialog("Cool! What make is it?");
		JOptionPane.showMessageDialog(null, "Nice, a " + model + "! That's a cool car!");
	}else if (car >= 1){
		JOptionPane.showMessageDialog(null, "Wow that's " + car * 4 + " many wheels.");
	}
}

private static void skill3() {
	int number = 0;
	int number2 = 0;
	Random ran = new Random();
	Random ran2 = new Random();
	number = ran.nextInt(20);
	System.out.println(number);
	number2 = ran2.nextInt(10);
	System.out.println(number2);
	System.out.println(number - number2);
}

private static void skill2() {
	for (int i = 0; i < 31; i+=3) {
		 System.out.println(i);
		}
}

private static void skill1() {
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int dime = Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "You have " + dime * 10 + " cents.");
	String inches = JOptionPane.showInputDialog("How tall are you in inches?");
	int inch = Integer.parseInt(inches);
	if(inch > 36) {
		JOptionPane.showMessageDialog(null, "You are tall enough.");
	}else {
		JOptionPane.showMessageDialog(null, "DRINK MILK.");
	}
}
}

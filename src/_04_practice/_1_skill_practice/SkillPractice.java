package _04_practice._1_skill_practice;

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
	
}

private static void skill4() {
	
}

private static void skill3() {
	
}

private static void skill2() {
	
}

private static void skill1() {
	String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
	int dime = Integer.parseInt(dimes);
	JOptionPane.showMessageDialog(null, "You have " + dime * 10 + " cents.");
	String inches = JOptionPane.showInputDialog("How tall are you?");
	int inch = Integer.parseInt(inches);
	if(inch > 36) {
		JOptionPane.showMessageDialog(null, "You are tall enough.");
	}else {
		JOptionPane.showMessageDialog(null, "DRINK MILK.");
	}
}
}

package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	static Robot rob = new Robot("batman");
public static void main(String[] args) {
	
	rob.penDown();
	rob.setSpeed(100);

String colorquestion = JOptionPane.showInputDialog("What color should the shape be, red, orange, yellow, green, blue, purple, or black?");
if(colorquestion.equals("red")) {
	rob.setPenColor(255, 0, 0);
}else if(colorquestion.equals("orange")) {
	rob.setPenColor(255, 110, 0);
}else if(colorquestion.equals("yellow")) {
	rob.setPenColor(255, 255, 0);
}else if(colorquestion.equals("green")) {
	rob.setPenColor(0, 255, 0);
}else if(colorquestion.equals("blue")) {
	rob.setPenColor(0, 0, 255);
}else if(colorquestion.equals("purple")) {
	rob.setPenColor(255, 0, 255);
}else if(colorquestion.equals("black")) {
	rob.setPenColor(0, 0, 0);
}else {
	rob.setRandomPenColor();
}

String shapequestion = JOptionPane.showInputDialog("What shape should be drawn, circle, triangle or square?");
if(shapequestion.equals("circle")) {
	drawCircle();
}if(shapequestion.equals("triangle")) {
	drawTriangle();
}if(shapequestion.equals("square")) {
	drawSquare();
}
	
}
private static void drawSquare() {
	int count=0;
	while ( count < 4 ) { 
        rob.move(100);
        rob.turn(90);
         count += 1;}
}
private static void drawTriangle() {
	int count=0;
	while ( count < 3 ) { 
        rob.move(150);
        rob.turn(120);
         count += 1;}
}
private static void drawCircle() {
	int count=0;
	while ( count < 360 ) { 
        rob.move(2);
        rob.turn(1);
         count += 1;}
}




	
}


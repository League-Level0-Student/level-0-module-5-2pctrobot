package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
String petType = JOptionPane.showInputDialog("What pet do you want, fish, dog, snake, or cat.");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
while(happinessLevel < 100) {
	

			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, petType, petType, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pat", "Walk", "Feed", "Water" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(petType.equals("Cat") && task == 0) {
				cat0();
			} else if(petType.equals("Cat") && task == 1) {
				cat1();
			} else if(petType.equals("Cat") && task == 2) {
				cat2();
			} else if(petType.equals("Cat") && task == 3) {
				cat3();
			} else if(petType.equals("Snake") && task == 0) {
				snake0();
			} else if(petType.equals("Snake") && task == 1) {
				snake1();
			} else if(petType.equals("Snake") && task == 2) {
				snake2();
			} else if(petType.equals("Snake") && task == 3) {
				snake3();
			} else if(petType.equals("Dog") && task == 0) {
				dog0();
			} else if(petType.equals("Dog") && task == 1) {
				dog1();
			} else if(petType.equals("Dog") && task == 2) {
				dog2();
			} else if(petType.equals("Dog") && task == 3) {
				dog3();
			} else if(petType.equals("Fish") && task == 0) {
				fish0();
			} else if(petType.equals("Fish") && task == 1) {
				fish1();
			} else if(petType.equals("Fish") && task == 2) {
				fish2();
			} else if(petType.equals("Fish") && task == 3) {
				fish3();
			} else if(happinessLevel > 100) {
				JOptionPane.showMessageDialog(null, "Congrats, you truly love your " + petType + ".");
				break;
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
}
	}
	private static void fish3() {
		JOptionPane.showMessageDialog(null, "The fish really likes the water.");
		happinessLevel += 50;
	}
	private static void fish2() {
		JOptionPane.showMessageDialog(null, "The fish likes the food.");
		happinessLevel += 10;
	}
	private static void fish1() {
		JOptionPane.showMessageDialog(null, "The fish can't breath.");
		happinessLevel -= 50;
	}
	private static void fish0() {
		JOptionPane.showMessageDialog(null, "You almost tip over the fish bowl when you pet it.");
		happinessLevel -= 20;
	}
	private static void dog3() {
		JOptionPane.showMessageDialog(null, "The dog doesn't care about the water.");
		happinessLevel -= 0;
	}
	private static void dog2() {
		JOptionPane.showMessageDialog(null, "The dog likes the food.");
		happinessLevel += 10;
	}
	private static void dog1() {
		JOptionPane.showMessageDialog(null, "The dog likes the walk.");
		happinessLevel += 20;
	}
	private static void dog0() {
		JOptionPane.showMessageDialog(null, "The dog likes the pets.");
		happinessLevel += 20;
	}
	private static void snake3() {
		JOptionPane.showMessageDialog(null, "The snake doesn't care about the water.");
		happinessLevel += 0;
	}
	private static void snake2() {
		JOptionPane.showMessageDialog(null, "The snake likes the food.");
		happinessLevel += 30;
	}
	private static void snake1() {
		JOptionPane.showMessageDialog(null, "The snake doesn't likes the walk.");
		happinessLevel -= 20;
	}
	private static void snake0() {
		JOptionPane.showMessageDialog(null, "The snake doesn't like the pets.");
		happinessLevel -= 10;
	}
	private static void cat3() {
		JOptionPane.showMessageDialog(null, "The cat doesn't care about the water.");
		happinessLevel += 0;
	}
	private static void cat2() {
		JOptionPane.showMessageDialog(null, "The cat loves the food.");
		happinessLevel += 20;
	}
	private static void cat1() {
		JOptionPane.showMessageDialog(null, "The cat won't walk.");
		happinessLevel -= 20;
	}
	private static void cat0() {
		JOptionPane.showMessageDialog(null, "The cat likes the pets.");
		happinessLevel += 20;
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}
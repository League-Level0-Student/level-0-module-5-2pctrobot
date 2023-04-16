package _02_nested_loops._3_for_loop_gauntlet;

public class For_Loop_Gauntlet {
public static void main(String[] args) {
	for (int i = 0; i < 101; i++) {
		System.out.println(i);
	}
	for (int i = 100; i > -1; i--) {
		System.out.println(i);
	}
	for (int i = 0; i < 51; i++) {
		System.out.println(i*2);
	}
	for (int i = 0; i < 51; i++) {
		System.out.println(i*2);
	}
	for (int i = 0; i < 101; i++) {
		if(i%2==0) {
			
		}else {
			System.out.println(i);
		}
	}
	for (int i = 0; i < 501; i++) {
		if(i%2==0) {
			System.out.println(i+" is even");
		}else {
			System.out.println(i+" is odd");
		}
	}
	for (int i = 0; i < 14; i++) {
		System.out.println("In "+20+(10+i)+", I was "+i+" years old");
	}
	for (int i = 0; i < 3; i++) {
		for (int j = 0; j < 3; j++) {
			System.out.println(i+" "+j);
		}}
	for (int i = 0; i < 7; i+=3) {
		for (int j = 1; j < 4; j++) {
			System.out.print(i+j);
			}
		System.out.println();
	}
	for (int i = 1; i < 11; i++) {
		for (int j = 0; j < 10; j++) {
			System.out.print(i+(10*j)+" ");}
			
		System.out.println();}
	for (int i = 1; i < 7; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("* ");
			}
		System.out.println();
	}
	}
}


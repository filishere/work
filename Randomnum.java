package homework;
import java.util.Scanner;
public class Randomnum {
	public static void main(String[] args) {
		int [] randomArray = new int [20];
		for(int i = 0; i < 20; i++) {
			randomArray [i] = ( int ) (Math.random() * 20) + 1;
		}
		for(int i = 0; i < 20; i++) {
			System.out.println(randomArray[i]);
		}
	}

}

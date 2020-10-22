package homework;
import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberRows = sc.nextInt();
		sc.close();
		for (int i = 0; i < numberRows ; i++) {
			for (int j = numberRows - i; j > 0; j--) {
				System.out.print(j + " ");
			}
		for (int j = 2 ; j <= numberRows - i ; j++) {
			System.out.print(j + " ");
		}
		System.out.println();	
		}
	}
}

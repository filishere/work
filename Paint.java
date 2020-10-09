package homework;
import java.util.Scanner;
public class Paint {
	 public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("What is the height of the room?");
					double height = sc.nextDouble();
					System.out.println("What is the length of the room?");
					double length = sc.nextDouble();
					System.out.println("What is the width of the room?");
					double width = sc.nextDouble();
					int area = (int) Math.ceil(width * length + 2 * ((width + length) * height));
	 int fiveLitersPrice = 15, oneLiterPrice = 4;
	 int fiveLitersAreaCover = 140, oneLitersAreaCover = 30;
	 int fiveLitersBuckets = 0, oneLitersBuckets = 0;
	 fiveLitersBuckets += area / fiveLitersAreaCover;
	 int areaLeft = area % fiveLitersAreaCover;
	 oneLitersBuckets = areaLeft / oneLitersAreaCover + ( (areaLeft % oneLitersAreaCover !=0) ? 1:0) ;
	 if (oneLitersBuckets * oneLiterPrice > fiveLitersPrice) {
		 oneLitersBuckets = 0;
		 fiveLitersBuckets++;
	 }
	 System.out.println ("It is needed " + fiveLitersBuckets + "five liters buckets and " 
	 + oneLitersBuckets + " one liter buckets");
	 }
	 
	 
}

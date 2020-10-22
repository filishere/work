package homework;
import java.util.Scanner;
public class Planets {
   public static void main(String[] args) {
	   
	// TODO Auto-generated method stub
			System.out.println("Enter weight");
			Scanner sc = new Scanner(System.in);
	   double weight = sc.nextDouble();
	   sc.nextLine();
	   System.out.println("Enter a planet of the solar system: ");
	   String planet =  sc.nextLine();
	   double weightOnAnotherPlanet = 1;
	   sc.close();
	   switch (planet){
		case "Mercury" :
			weightOnAnotherPlanet = 0.38 * weight;
			break;
		case "Venus" :
			weightOnAnotherPlanet = 0.91 * weight;
			break;
		case "Mars" :
			weightOnAnotherPlanet = 0.38 * weight;
			break;
		case "Jupiter" :
			weightOnAnotherPlanet = 2.36 * weight;
			break;
		case "Saturn" :
			weightOnAnotherPlanet = 0.92 * weight;
			break;
		case "Uranus" :
			weightOnAnotherPlanet = 0.89 * weight;
			break;
		case "Neptune" :
			weightOnAnotherPlanet = 1.13 * weight;
			break;
		}
	   System.out.println("Your weight on" + planet + " " + weightOnAnotherPlanet*weight);
   }
}

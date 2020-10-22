package homework;

import java.util.Scanner;
public class Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("In how many years do you want to know the cost of one year tuition?");
		int Years = sc.nextInt();
		System.out.println("For how many years do you want to study in university?");
		int forYears = sc.nextInt();
		System.out.println("How much is the tuition now?");
		double tuition = sc.nextDouble();
		System.out.println("How much does it increase every year?");
		double increase = sc.nextDouble();
		double tuitionTenYears = tuition;
		double fourYearsWorthOfTuition = tuition;
		sc.close();
		for (int i = 0; i < Years; i++) {
			tuitionTenYears += increase*tuitionTenYears;
		}
		for (int i = 1; i < forYears; i++) {
			tuition += tuition*increase;
			fourYearsWorthOfTuition += tuition;
		}
		System.out.println("The tuition for university in " + Years + " years will be " 
		+ (int)(tuitionTenYears*100)/100.0 + " !");
		System.out.println(forYears + " years of tuition for university will cost " 
		+ (int)(fourYearsWorthOfTuition*100)/100.0 + " !");
	
	}
}
	
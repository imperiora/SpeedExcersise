 import java.util.Scanner;
public class Speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner distance = new Scanner(System.in);	
		System.out.print("Input distance in meters: ");
		double meters = distance.nextInt();
		
		Scanner time1 = new Scanner(System.in);
		System.out.print("Input hour ");
		double hour = time1.nextInt();
		
		Scanner time2 = new Scanner(System.in);
		System.out.print("Input minutes ");
		double minutes = time2.nextInt();
		
		Scanner time3 = new Scanner(System.in);
		System.out.print("Input seconds ");
		double seconds = time3.nextInt();
				
		double secondSum = (hour*3600) + (minutes*60) + seconds;
		double hourSum = hour + (minutes/60) + (seconds/3600);
		double km = meters/1000;
		double mi = meters/1609;
		
		double MetSec = meters/secondSum;
		double KmHr = km/hourSum;
		double MiHr = mi/hourSum;
		
		System.out.println("Your speed in meters/second is " + MetSec);
		System.out.println("Your speed in km/h is " + KmHr);
		System.out.println("Your speed in miles/h is " + MiHr);
	}

}

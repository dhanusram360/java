package mycaptain;

import java.util.Scanner;

public class Challenge_methods_packages {

	public static void main(String[] args) {
		System.out.println("Enter time minutes:");
		Scanner min = new Scanner (System.in);
		int inp ;
		inp=min.nextInt();
		min.close();
		System.out.println(inp);
		minutes_years( inp);
		
		}
    public static void minutes_years( int inp){
	        float temp = (float)inp/525600;
	        int years = (int)temp;
	        int days = (int)((temp-years)*365);
	        String opt = inp + " minutes is approximately " + years + " years and " + days + " days";
	        System.out.println(opt);
	        }
	

}

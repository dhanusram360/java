package mycaptain;
import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		int a;
		boolean b = false;
		System.out.println("enter your age");
		Scanner s = new Scanner (System.in);
		a = s.nextInt();
		s.close();
		if(a>=18)
		{
			 b = true;
		}
		else {
			b=false;
			System.out.println("you are not  eligible");
			
			
		}
		while(b==true) {
			System.out.println("you are eligible");
			break;
		}
		
	}

}

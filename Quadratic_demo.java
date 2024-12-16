import java.util.*;

public class Quadratic_demo{
public static void main(String args[])
	{
		double a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coefficients of Quadratic Equation");
		System.out.println("Enter a:");		
		a = s.nextDouble();
		System.out.println("Enter b:");			
		b = s.nextDouble();
		System.out.println("Enter c:");	
		c = s.nextDouble();
		
		if (a==0){
			System.out.println("Coefficient of x^2 can't be zero");
		}
		else{
			double d = (b*b) -(4*a*c);
			if(d>0){
				System.out.println("Roots are distinct and real");
				double r1 = (-b+Math.pow(d,0.5))/(2*a);
				double r2 = (-b-Math.pow(d,0.5))/(2*a);
				System.out.println("r1 = "+r1);
				System.out.println("r2 = "+r2);
			}
			else if(d<0){
				System.out.println("Roots are distinct and imaginary");
				double r1 = (-b/(2*a));
				double r2 = Math.pow(Math.abs(d),0.5)/(2*a);
				System.out.println("r1 = "+r1+" +i"+r2);
				System.out.println("r2 = "+r1+" -i"+r2);
			}
			else{
				System.out.println("Roots are equal and real");
				double r1 = (-b+Math.pow(d,0.5))/(2*a);
				double r2 = (-b-Math.pow(d,0.5))/(2*a);
				System.out.println("r1 = "+r1);
				System.out.println("r2 = "+r2);
			}
		}
	}

}

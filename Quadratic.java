import java.util.Scanner;
class Quadratic{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double r1,r2;
int d;
System.out.println("Enter the value of a:");
int a = sc.nextInt();
System.out.println("Enter the value of b:");
int b = sc.nextInt();
System.out.println("Enter the value of c:");
int c = sc.nextInt();
d = b*b-4*a*c;
if(a==0 || b==0 || c==0){
System.out.println("Invalid Inputs");
}
else if (d<0){
System.out.println("There is no real solution");
}
else if(d>0){
System.out.println("The roots are real and distinct");
r1 = (-b+Math.sqrt(d))/(2*a);
r2 = (-b-Math.sqrt(d))/(2*a);
System.out.println("The roots are:"+r1 + " "+ r2);
}

}
}



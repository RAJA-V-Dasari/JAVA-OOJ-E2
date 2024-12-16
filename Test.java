import java.util.*;

class Student{
	String usn;
	String name;
	int sem;
	Student(String s, String s1, int i){
		usn = s;
		name = s1;
		sem = i;
	}
	void set_usn(String s){
		this.usn = s;
	}
	void set_name(String s){
		this.name = s;
	}
	void set_sem(int i){
		this.sem = i;
	}
	String get_usn(){
		return this.usn;
	}
	String get_name(){
		return this.name;
	}
	int get_sem(){
		return this.sem;
	}
	void display_details(){
		System.out.println("NAME :"+this.name);
		System.out.println("USN  :"+this.usn);
		System.out.println("SEM  :"+this.sem);
	}
	
}

class Internals{
	int sem;
	int[] marks = new int[5]; 
	
	void set_Internals(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the internal marks of five subjects:");
		for(int i = 0; i<5; i++){
			this.marks[i]=s.nextInt();
		}	
	}
	void display_Internals(){
		System.out.println("Internal Marks: ");
		for(int i = 0;i<5;i++){
			System.out.print(this.marks[i]+"  ");
		}	
		System.out.println();
	}
}

class Externals extends Student{
	int[] externals = new int[5];
	Internals i = new Internals();
	
	Externals(String usn, String name, int sem){
		super(usn,name,sem);
	}
	void set_internal(){
		i.set_Internals();
	}
	
	void set_Externals(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the external marks of five subjects:");
		for(int i = 0; i<5; i++){
			this.externals[i]=s.nextInt();
		}
	}
	void display_Externals(){
		System.out.print("Extrenal Marks: ");
		for(int i = 0;i<5;i++){
			System.out.print(this.externals[i]+"  ");
		}
		System.out.println();
	}
	void display_all(){
		display_details();
		i.display_Internals();
		display_Externals();
	}
}

public class Test{
	public static void main(String[] args){
		Externals s = new Externals("1BM23CS259", "Raja",3);
		s.set_internal();
		s.set_Externals();
		s.display_all();
	}
}







































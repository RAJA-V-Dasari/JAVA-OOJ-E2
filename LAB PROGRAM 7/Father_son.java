import java.util.*;
class WrongAge extends Exception{
	WrongAge(String s){
		super(s);
	}
}
class Father{
	public int age;
	Father(int a) throws WrongAge{
		if(a<0){
			throw new WrongAge("Age can't be negative");
		}
		else{
			this.age = a;
		}
	}
	
}

class Son extends Father{
	int s_age;
	Son(int f_age,int s_age) throws WrongAge{
		super(f_age);
		if(s_age<0){
			throw new WrongAge("Age can't be negative");
		}	
		else if (s_age>=f_age){
			throw new WrongAge("Father's age can't be less than Son's age");
		}
		else{
			this.s_age = s_age; 
		}
	}
}


public class Father_son{
	public static void main(String[] args){
		try{
			Father f = new Father(20);
			Son s = new Son(20,2);
		}
		catch(WrongAge e){
			System.out.println("Error:" + e.getMessage());
		}
		try{
			Father f = new Father(-3);
			Son s = new Son(-3,2);
		}
		catch(WrongAge e){
			System.out.println("Error:" + e.getMessage());
		}
		try{
			Father f = new Father(20);
			Son s = new Son(20,-2);
		}
		catch(WrongAge e){
			System.out.println("Error:" + e.getMessage());
		}
		try{
			Father f = new Father(20);
			Son s = new Son(20,21);
		}
		catch(WrongAge e){
			System.out.println("Error:" + e.getMessage());
		}
	}
}

package CIE;

class Personal{
	String usn;
	String name;
	int sem;
	
	Personal(String s, String n, int se){
		usn = s;
		name = n;
		sem = se;
	}
	void display_details(){
		System.out.println("USN: "+this.usn);
		System.out.println("NAME: "+this.name);
		System.out.println("SEM: "+this.sem);
		
	}
	
}


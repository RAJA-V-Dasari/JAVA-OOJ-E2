class Account{
	String customer_name;
	int acc_no;
	String acc_type = "Not Set";
	double balance = 0.0;
	
	Account(String s, int a){
		this.customer_name=s;
		this.acc_no = a;
	}
		
	void deposit(double amount){
		this.balance += amount;
	}
	double get_balance(){
		return this.balance;
	}
	void display_balance(){
		System.out.println("Balance: "+this.balance);
	}
	void acc_details(){
		System.out.println("Customer Name: "+this.customer_name);
		System.out.println("Account Number: "+this.acc_no);
		System.out.println("Account Type: "+this.acc_type);
		System.out.println("Balance: "+this.get_balance());
		
	}
	
	
}

class Cur_acct extends Account{
	final double min_bal = 1000.0;
	final double fine = 100.0;
	Cur_acct(String s, int a){
		super(s,a);
		super.acc_type = "Current Account";
	}
	void withdraw(double w){
		if(w <= this.balance){
			balance -= w;
			System.out.println("Withdrew: " +w);
			if(this.balance >= min_bal){
				this.display_balance();
			}
			else if(this.balance < min_bal){
				balance-=this.fine;
				System.out.println("Fine imposed, keep your balance above 1000.0");
				this.display_balance();
			}
		}
		else{
			System.out.println("Insufficient balance :"+ this.get_balance());				
				
		}
			
	}
	
}

class Sav_acct extends Account{
	 
	 Sav_acct(String s, int a){
		super(s,a);
		super.acc_type = "Savings Account";
	}
	
	void interest_deposit(double interest_rate){
		balance = balance + (balance*interest_rate);
		System.out.println("Balance after adding interest : "+this.get_balance());
	}
	void withdraw(double w){
		if(w<=this.balance){
			balance -= w;
			System.out.println("Withdrew: " +w);
		}
		else{
			System.out.println("Insufficient balance :"+ this.get_balance());
		}
	}
	


}

class Bank{
	public static void main(String[] args){
		Cur_acct c = new Cur_acct("Raja",123);
		Sav_acct s = new Sav_acct("Vishwanath",456);
		
		c.deposit(2000.0);
		c.withdraw(1000.0);
		c.withdraw(500.0);
		c.withdraw(500.0);
		c.acc_details();
		
		s.deposit(3000.0);
		s.interest_deposit(0.1);
		s.interest_deposit(0.05);
		s.withdraw(4000.0);
		s.withdraw(3000.0);
		s.acc_details();
		
		
	}

}
	



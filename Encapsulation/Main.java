// public class Student {
// 	private int age;
	
// 		public void setAge(int age) {
		
// 			if(age > 0 ) {
			
// 				this.age = age;
// 		}
// 	}
	
// 		public int getAge() {
		
// 			return age;
// 	}	

// 	public static void main(String [] args) {
		
// 		Student s1 = new Student();
// 		s1.setAge(20);
// 		System.out.println("Age : "+s1.getAge());
// 	}
// }


// ========== Real-life Example for Encapsulation & Data Hiding ===========================
class BankAccount {
	
	private double balance;
	
		public void deposit(double amount) {
		
			if(amount >0) {
			
				balance += amount;
		}
	}
	
		public void withdraw(double amount) {
		
			if(amount >0 && amount <= balance) {
		
				balance -= amount;
		}
	}
		
		public double getBalance() {
			
			return balance;
	}
} 
	
public class Main {
	
	public static void main(String [] args) {	

	    BankAccount acc = new BankAccount();
	    acc.deposit(5000);
    	acc.withdraw(1000);
	
	    System.out.println("Balance : "+acc.getBalance());
	}
}
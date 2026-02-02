public class Student {
	private int age;
	
		public void setAge(int age) {
		
			if(age > 0 ) {
			
				this.age = age;
		}
	}
	
		public int getAge() {
		
			return age;
	}	

	public static void main(String [] args) {
		
		Student s1 = new Student();
		s1.setAge(20);
		System.out.println("Age : "+s1.getAge());
	}
}
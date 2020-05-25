
 class Employee implements Cloneable {
	 
	 String name, address;
	 int age;
	 
	 Employee cloneTest() {
		 
		 try {
			 
			 return (Employee) super.clone();
			 
		 }
		 catch (CloneNotSupportedException e) {
			 
			 System.out.println("Clonning not allowed.");
			 return this;
			 
		 }
	 }
	 
	 //setters
	 public void setName(String n) {
		 name = n;
	 }
	 public void setAddress(String a) {
		 address = a;
	 }
	 public void setAge(int g) {
		 age = g;
	 }
	 
	 //getters
	 public String getName() {
		 return name;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public int getAge() {
		 return age;
	 }
	 
	 //main method
	 public static void main(String args[]) {
		 
		 Employee e = new Employee();
		 Employee e1;
		 e.setName("Beyonce");
		 e.setAddress("California");
		 e.setAge(28);
		 System.out.println("Name : " + e.getName());
		 System.out.println("Address : " + e.getAddress());
		 System.out.println("Age : " + e.getAge());
		 
		 //clonning
		 e1 = e.cloneTest();	//clone e
		 System.out.println("Name after clonning : " + e1.getName());
		 System.out.println("Address after clonning : " + e1.getAddress());
		 System.out.println("Age after clonning : " + e1.getAge());
	 }
	 
 }
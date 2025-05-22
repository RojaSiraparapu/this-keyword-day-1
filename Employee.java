package thiskeyword;

public class Employee {
	


		String name;
		double salary;
		
		public Employee(String name,double salary) {
			this.name=name;
			this.salary=salary;
		
		}
		public void setSalary(String name,double salary) {
			this.name=name;
			this.salary=salary;
		}
		
		public void display() {
			
			System.out.println("Name: "+name+"\nSalary: "+salary);
			
		}
		
		public static void main(String[] args) {
			System.out.println("Before Updation : ");
			Employee emp=new Employee("Roja",55000.0);
			emp.display();
			System.out.println("----------");
			System.out.println("After Updation : ");
			emp.setSalary("ABS",75000.0);
			emp.display();
		
		}

	

	

	}



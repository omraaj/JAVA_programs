package nov27treeset;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, other.id);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee:id "+id+", Name: "+name+", Salary: " + salary;
	}
	
	
}
public class emploeeSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> tset = new TreeSet<>();
		Employee emp1 = new Employee(101, "Omraj", 100000);
		Employee emp2 = new Employee(102, "Swaraj", 200000);
		Employee emp3 = new Employee(103, "Adhiraj", 2300000);
		tset.add(emp1);
		tset.add(emp2);
		tset.add(emp3);
		System.out.println(tset);

	}

}

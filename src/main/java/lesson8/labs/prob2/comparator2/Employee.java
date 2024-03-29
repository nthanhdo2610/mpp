package lesson8.labs.prob2.comparator2;

import java.util.Objects;

public class Employee {
	String name;
	int salary;
	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && e.salary==salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
}


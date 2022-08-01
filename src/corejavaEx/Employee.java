package corejavaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;




class emp{
	
	
	int empId;
	String name;
	String designation;
	double salary;
	
	public emp(int empId, String name, String designation, double salary) {

		this.empId = empId;
		this.name = name;
	
		this.designation = designation;
		this.salary = salary;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "emp [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
}

public class Employee {

	public static void main(String[] args) {
		
		
		
		List<emp> employ = new ArrayList<>();
		 employ.add(new  emp(1,"Anji", "JavaDevaloper", 50000)); 
		 employ.add(new  emp(2,"thanuja", "PhpDevaloper", 60000));
		 employ.add(new  emp(3,"sagar", "SrJavaDevaloper", 70000)); 
		 employ.add(new  emp(4,"rajashekar", "SrJavadevaloper", 70000));
		 employ.add(new  emp(5,"rama", "PhpDevaloper", 60000));
		 employ.add(new  emp(6,"shalini", "Web", 50000));
		 employ.add(new  emp(7,"sagar", "SrJavaDevaloper", 70000)); 
		 employ.add(new  emp(8,"rajashekar", "SrJavadevaloper", 70000));
		 employ.add(new  emp(9,"rama", "PhpDevaloper", 60000));
		 employ.add(new  emp(10,"shalini", "Web", 50000));
		 
		 
	  Map<String, Long> empl = new HashMap<>();
          
	 empl = employ.stream() .collect(Collectors.groupingBy(emp::getDesignation,Collectors.counting()));
		  
		  
//		  Map<emp, Long> result =
//	               employ.stream().collect(
//	                        Collectors.groupingBy(
//	                                Function.identity(), Collectors.counting()));
////	                        
//		  Map<Object, List<emp>> des=employ.stream().collect(Collectors.groupingBy(empl->empl.getDesignation()));
		  
		 System.out.println("Toatal Employee Designations : " +empl);

		
		 
		 
	}
}
		


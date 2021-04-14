package collection_array_arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class Array_ArrayList {

	public static void main(String[] args) {
		
			
			String student [] = {"Peter","Sam","Kevin","Ben"};
			
			for(int i=0; i<4; i++) {
				System.out.println(student[i]);
			}
			
			Employee e1 = new Employee("Naveen", 27, "QA");
			Employee e2 = new Employee("Saliya", 30, "Dev");
			Employee e3 = new Employee("Russel", 25, "Prod");
					
			
			ArrayList<Employee> ar4 = new ArrayList();
			ar4.add(e1);
			ar4.add(e2);
			ar4.add(e3);
			
			
			Iterator<Employee>it= ar4.iterator();//ar4 implemented iterator over here
			while(it.hasNext()) {
				Employee emp=it.next();//it.next storing Employee using emp reference
				System.out.println(emp.name+emp.age+emp.dept);
				
			}
			//Important Interview Question ?
			
			//How to Store specific user define "class" object in ArrayList ?
					
					//I create user define class using relevent variable and simply create
					//constructors using those variables inside same class and store the value 
			        //in ArrayList Object Using Iterator we traverse through the list and using 
			        //while loop we can retrieve the values.

		}


	}



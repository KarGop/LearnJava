package org.department;
import java.util.*;  

import org.college.College;

public class Department extends College{
 public void deptName() {
	 System.out.println("Department names are ");
	 List<String> list=new ArrayList<String>(); 
	 list.add("ECE");
	 list.add("CSE");
	 list.add("CIVIL");
	 list.add("Mech");
	 for (String string : list) {
		System.out.println("\t"+string);
	}
 }
}

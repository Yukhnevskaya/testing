package task1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private List<Position> positions;
	
	private class Position {
		
		private String name;
		private List<String> employees;
		
		public Position(String name) {
			this.name = name;
			this.employees = new ArrayList<String>();
		}
		
		public void addEmployee(String employee) {
			employees.add(employee);
		}
		
		public String getName() {
			return this.name;
		}
		
		public List<String> getEmployees() {
			return this.employees;
		}
	}
	
	public void addPosition (String position) {
		positions.add(new Position (position));
	}
	
	public void addEmployeeToPosition (String employee, String position) {
		for (Position item : positions) {
			if(item.getName().equals(position)) {
				item.addEmployee(employee);
			}
		}
	}
	
	public List<String> getEmployees(String position) {
		for (Position item : positions) {
			if (item.getName().equals(position)) {
				return item.getEmployees();
			}
		}
		return null;
	}
	
}

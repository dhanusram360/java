package mycaptain;
public class Employee {
	public String Name() {
		String name ="Robert";
		return name;
		}
	public int year() {
		int Year =1994;
		return Year;
		}
	public String salary() {
		String Salary ="64C";
		return Salary;
		}
	public String address() {
		String Address ="WallsStreet Sam 2000 68D- WallsStreet John 1999 26B- WallsStreet";
		return Address;}
	


public static void main(String[] args) {
	Employee output = new Employee();
	System.out.println("Name Year of joining Address"+" "+output.Name()+" "+output.year()+" "+output.salary()+"-"+output.address());
	
}}
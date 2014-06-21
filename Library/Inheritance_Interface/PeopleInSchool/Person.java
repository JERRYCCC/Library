package PeopleInSchool;



//you can not build " Person p = new Person", because this is an abstract class
public abstract class Person implements PersonInterface{

	public String name;
	public int DOB;
	public long number;
	
	public Person(String newName, int newDOB, long newNumber){
		name = newName;
		DOB = newDOB;
		number = newNumber;
	}
	@Override
	public void setName(String newName) {
		name = newName;	
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setDOB(int newDate) {
		DOB = newDate;
	}

	@Override
	public int getDOB() {
		return DOB;
	}
	
	public void setNumber(long newNumber){
		number = newNumber;
	}
	
	public long getNumber(){
		return number;
	}

	@Override
	public void eat() {
		System.out.println(name + " is eating.");
		
	}

	@Override
	public void sleep() {
		System.out.println(name + " is sleeping.");
		
	}

}

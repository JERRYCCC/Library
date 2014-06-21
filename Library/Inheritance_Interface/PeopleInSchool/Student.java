package PeopleInSchool;


public class Student extends Person implements StudentInterface  {

	private boolean inclass = false;
	
	public Student(String newName, int newDOB, long newNumber, boolean newInClass) {
		
		super(newName, newDOB, newNumber);
	}

	@Override
	public boolean inClass() {
		return inclass;
	}

	@Override
	public void study() {
		System.out.println(name + " is studying.");
		
	}

	@Override
	public void intership() {
		System.out.println(name + "is doing intership.");
		
	}
}

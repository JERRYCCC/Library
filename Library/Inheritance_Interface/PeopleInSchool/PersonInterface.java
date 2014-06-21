package PeopleInSchool;


/*
 * This interface could be use to define person in different class, this case is in the school
 * But it also could be in the hospital, company, restaurant, and so on 
 */
public interface PersonInterface {
	
	void setName(String newName);
	String getName();
	void setDOB(int newDate);
	int getDOB();
	void setNumber(long newNumber);
	long getNumber();
	void eat();  
	void sleep();
	
}

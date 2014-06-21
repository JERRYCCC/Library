package PeopleInSchool;
/**
 * 
 * Interface is the function, and ability
 * Interface is go breadth.
 * For example, the PersonInterface could be implemented by PersonInSchool, PersonInRestaurant, PersonInHospital
 * the PersonInSchool can implements several interfaces, which means it can do all the actions included in cited interfaces.
 * like APersonInterface, BPersonInterface, CPersonInterface. A B C three kinds of person have different abilities.
 * 
 * Inheritance is the basic attribute
 * Inheritance is go depth.
 * For example, the PersonInSchool class could be extends to Student, Professor 
 * 
 * Abstract class is the "father class" like person.class.
 * They can not be built, have to extends by children class and become useful.
 * 
 * @author Jerry
 *
 */

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Student Jerry = new Student("Jerry", 90815, 6347819, true);
		Student Rose = new Student("Rose", 901112, 124578, false);
		Student Jack = new Student("Jack", 921213, 356245, true);
		
		Jerry.eat();
		Jerry.sleep();
		Jerry.study();
		
	

	}
}

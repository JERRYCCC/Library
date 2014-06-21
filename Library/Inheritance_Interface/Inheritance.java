

public class Inheritance {

	public static void main(String[] args) {
		Student s1 = new Student("Jerry");
        ACStudent s2 = new ACStudent("Rose");
        s2.setMentor("Jane");
        System.out.println(s1.getName());
        System.out.println(s2.getName());    //this call ACStudent's father class >>>>> Student.getName()
        System.out.println(s2.getMentor());
	}
	
	public static class Student{
		
		public String name;	
		public Student(String newName){
			name = newName;
		}
		
		public String getName(){
			return name;
		}
		
		public void setName(String newName){
			name = newName;
		}
	}
	
	//ACStudent is inherit from Student, ACStudent has all the function and variables of Student
	public static class ACStudent extends Student{
		
		public String mentor;
		public ACStudent(String newName){
			super(newName);    //pass the "newName" to its super class - Student's constructor
		}
		
		public void setMentor(String newName){
			mentor = newName;
		}
		
		public String getMentor(){
			return mentor;
		}
	}
}

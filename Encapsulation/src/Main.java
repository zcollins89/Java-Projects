//Encapsulation example
//https://www.youtube.com/watch?v=cU94So54cr8
public class Main {

	public static void main(String[] args) {
		//create the student objs and call them
		student s = new student();
		
		s.setName("John");
		
		s.setAge(18);
		
		System.out.println(s.getName() + "\n" + s.getAge());

	}

}

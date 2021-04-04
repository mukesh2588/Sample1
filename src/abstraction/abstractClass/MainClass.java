package abstraction.abstractClass;

public class MainClass {

	public static void main(String[] args) {
		Dog obj=new Dog();
		Animal test1=new Dog();
		
		obj.aminalSound();
		obj.sleep();

		test1.sleep();
		test1.aminalSound();
	}

}

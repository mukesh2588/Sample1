package abstraction.interfaceTest;

public class DogInterfaceTest implements Animal
{

	@Override
	public void animalSOund() {
		System.out.println("Dog barks!!!");
		
	}

	@Override
	public void sleep() {
		System.out.println("Sleep Test method");
		
	}

}

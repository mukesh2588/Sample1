import java.util.Scanner;

public class UserInputTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		int num=sc.nextInt();
		
		double dub=sc.nextDouble();
		
		float flt=sc.nextFloat();
		
		System.out.println(str);
		System.out.println(num);
		System.out.println(dub);
		System.out.println(flt);
		
		sc.close();

	}

}

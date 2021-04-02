package stringProgs;

public class StringRev2 {

	public static void main(String[] args) {
		String str="Mukesh";
		//String rev="";
		char[] charArr=str.toCharArray();
		
		for (int i =charArr.length-1; i >=0; i--) 
		{
			System.out.print(charArr[i]);
		}
		
		/*for (int i = str.length()-1; i>=0; i--) 
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);*/

	}

}

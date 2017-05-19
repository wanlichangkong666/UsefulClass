import java.util.Scanner;


public class TheFirstNumber {

	public static int getNumber(String s){
		
		char[] cArray=s.toCharArray();
		for (char c : cArray) {
			if(c>='0'&&c<='9')
			{
				return c-'0';
			}
		}
		return -1;
	}
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);	
    System.out.println(getNumber(scanner.nextLine()));
	}

}

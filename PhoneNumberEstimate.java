import java.util.Scanner;
import java.util.Vector;


public class PhoneNumberEstimate {
	
	static Vector<String>phoneNumbers=new Vector<String>();
	static Vector<Integer>results=new Vector<Integer>();
	public static int getScore(String phoneNumber)
	{
		int score=0;
		int count=0;
		char[] number=phoneNumber.toCharArray();
		for(count=0;count<3;count++)
		{
			if((number[count+1])-1!=number[count])
				break;
		}
		if(count==3)
		  score+=5;
		for(count=0;count<3;count++)
		{
			if((number[count+1])+1!=number[count])
				break;
		}
		if(count==3)
		  score+=5;
		if(number[0]==number[1]&&number[1]==number[2])
			score+=3;
		if(number[1]==number[2]&&number[2]==number[3])
			score+=3;
		if(number[0]==number[1]&&number[2]==number[3])
			score+=1;
		if(number[0]==number[2]&&number[1]==number[3])
			score+=1;
		for (char num : number) {
			if(num=='6'||num=='8'||num=='9')
				score+=1;
		}
		return score;
		
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		scanner.nextLine();		
		for(int i=0;i<N;i++)
		{
			phoneNumbers.add(scanner.nextLine());
		}
		for(int i=0;i<N;i++)
		results.add(getScore(phoneNumbers.elementAt(i)));
		for(int i=0;i<N;i++)
		System.out.println(results.elementAt(i));
		
		
		

	}
	

}

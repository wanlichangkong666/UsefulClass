import java.io.ObjectInputStream.GetField;
import java.math.BigInteger;
import java.util.Scanner;


public class WheatProblem {
	public static BigInteger getWheatAmount(){
		BigInteger amount=new BigInteger("0");
		 BigInteger base=new BigInteger("2");
		 System.out.println(base.pow(64).add(new BigInteger("-1")));
		for(int i=0;i<=63;i++)
		{
			amount=amount.add(base.pow(i));
		}
		return amount;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println(getWheatAmount());

	}

}

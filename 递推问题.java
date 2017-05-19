import java.awt.List;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CORBA.LongLongSeqHelper;


public class µ›Õ∆Œ Ã‚ {
  /* public static long F1(long n)
   {
	   if(n==1)
		   return 2;
	   if(n==2)
		   return 1;
	   if(n==3)
		   return 6;
	   return (F2(n-1)+2*F1(n-3)+5)%99999999;
   }
   public static long F2(long n)
   {
	   if(n==1)
		   return 3;
	   if(n==2)
		   return 4;
	   if(n==3)
		   return 5;
	   return (F1(n-1)+3*F1(n-3)+2*F2(n-3)+3)%99999999;
   }*/
	/*public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BigInteger n=scanner.nextBigInteger();
		ArrayList<BigInteger> list1=new ArrayList<BigInteger>();
		ArrayList<BigInteger>list2=new ArrayList<BigInteger>();
        for(BigInteger i=new BigInteger("1");i.compareTo(n)<=0;i=i.add(BigInteger.ONE))
        {
        	if(i.equals(BigInteger.ONE))
        	{
        		list1.add(new BigInteger("2"));
        		list2.add(new BigInteger("3"));
        	}
        	else if(i.equals(new BigInteger("2")))
        	{
        		list1.add(new BigInteger("1"));
        		list2.add(new BigInteger("4"));
        	}
        	else if(i.equals(new BigInteger("3")))
        	{
        		list1.add(new BigInteger("6"));
        		list2.add(new BigInteger("5"));
        	}
        	else{
        		list1.add(list2.get(list2.size()-1).add(list1.get(list1.size()-3).multiply(new BigInteger("2"))).add(new BigInteger("5")));
        		list2.add(list1.get(list1.size()-2).add(list1.get(list1.size()-4).multiply(new BigInteger("3"))).add(list2.get(list2.size()-3).multiply(new BigInteger("2"))).add(new BigInteger("3")));
        	}
        	
        }
        System.out.println(list1.get(list1.size()-1).mod(new BigInteger("99999999")));
        System.out.println(list2.get(list2.size()-1).mod(new BigInteger("99999999")));
	}
*/
	
}

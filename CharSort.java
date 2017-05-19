import java.util.Scanner;
import java.util.Vector;


public class CharSort {
	public static long count=0;
	private void fullPermutation(Vector<Character>source,Vector<Character>result)
	{
		if(source.size()==0)
		{
			for(int i=0;i<result.size();i++)
			{
				System.out.print(result.elementAt(i));
			}
			System.out.println();
			count++;
			return;
		}
		for(int i=0;i<source.size();i++)
		{
			Vector<Character>tsource=new Vector<Character>(source);
			Vector<Character>tresult=new Vector<Character>(result);
			tresult.add(source.elementAt(i));
			tsource.remove(i);
			new CharSort().fullPermutation(tsource, tresult);
		}
			
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		Vector<Character>source=new Vector<Character>();
		Vector<Character>result=new Vector<Character>();
		for(int i=0;i<n;i++)
		{
			source.add((char)('A'+i));			
		}
       new CharSort().fullPermutation(source, result);
       System.out.println(CharSort.count);
       
	}

}

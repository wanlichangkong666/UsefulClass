import java.util.Vector;


public class NumbersCombinationPlus {
	public static int count;
	public static void allType(Vector<Character>source,Vector<Character>result)
	{
		if(source.size()==0){
			int a=(result.elementAt(0)-'0')*100+(result.elementAt(1)-'0')*10+result.elementAt(2)-'0';
			int b=(result.elementAt(3)-'0')*100+(result.elementAt(4)-'0')*10+result.elementAt(5)-'0';
			int c=(result.elementAt(6)-'0')*100+(result.elementAt(7)-'0')*10+result.elementAt(8)-'0';
			if(a+b==c){
				System.out.printf("%d+%d=%d\n", a,b,c);
				count++;
			}
			
			
		}
		else{
			for(int i=0;i<source.size();i++)
			{
				result.add(source.elementAt(i));
				source.remove(i);
				allType(source, result);
				source.add(i,result.elementAt(result.size()-1));
				result.remove(result.size()-1);
			}
		}

	}
	

	public static void main(String[] args) {
		Vector<Character>source=new Vector<Character>();
		Vector<Character>result=new Vector<Character>();
		for(int i=1;i<=9;i++)
			source.add((char)(i+'0'));
		allType(source, result);
		System.out.println(count);

	}

}

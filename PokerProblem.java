import java.util.ArrayList;
import java.util.Iterator;


public class PokerProblem {
	static String[] poker={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	

	public static void getSort(ArrayList<String>pokers) 
	{
		//ArrayList<String>pokersnew=new ArrayList<String>();
		//if(pokers.size()==0)
			//return;
		/*for(int i=0;i<pokers.size();i++)			
			{
			if(i%2!=0)			
			{
				if(pokers.size()>1)
				System.out.print(pokers.get(i)+",");
				else 
				{
					System.out.print(pokers.get(i));
				}
			}
			else 
			{				
				pokersnew.add(pokers.get(i));
			}			
			}*/
	
		//System.out.println(pokers.size());
		//getSort(pokersnew);
		int count=1;
		while(pokers.size()!=0)
		{
			if(count%2==0)
			{

				if(pokers.size()>1)
				{
					System.out.print(pokers.get(0)+",");
					pokers.remove(0);
				}
				else 
				{
					System.out.print(pokers.get(0));
					pokers.remove(0);
				}
			}
			else 
			{
				pokers.add(pokers.remove(0));
			}
			count++;
		}
		
	}

	public static void main(String[] args) {
		ArrayList<String>pokers=new ArrayList<String>();
		for (String string : poker) {
			pokers.add(string);
		}
		//System.out.println(pokers.size());
		/*Iterator<String>iterator=pokers.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next());≤‚ ‘”√*/
       getSort(pokers);
	}

}

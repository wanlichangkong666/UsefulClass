import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class QueueOperation {

	public static void main(String[] args) {
		Queue<Integer>q=new LinkedList<Integer>();
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		
		scanner.nextLine();
		String[] operations=new String[N];
		for(int i=0;i<N;i++)
		{
			String operation=scanner.nextLine();
			operations[i]=operation;			
		}
		for(int i=0;i<N;i++)
		{
			if(operations[i].charAt(0)=='1')
			{
				int num=Integer.parseInt(operations[i].substring(2));
				q.add(num);
			}
			else if(operations[i].equals("2")){
			 
			 if(q.isEmpty())
				{	
					System.out.println("no");
					return;
				}
			 else{
				 System.out.println(q.remove());
			 	}
			}
			else if(operations[i].equals("3"))
			{								
					System.out.println(q.size());				
			}
		}

	}

}

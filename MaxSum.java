
import java.util.ArrayList;
import java.util.Scanner;



class Num{

	public int a;
	public int b;
	public Num(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}

public class MaxSum {
	
	public static final int inf=0x3f3f3f3f;
	public static final int t=100000;
	public static int[][] dp=new int[105][200001];
	public static int f(ArrayList<Num>list)
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=-t;j<=t;j++)
			dp[i][j+t]=-inf;
		}
			for (int i=0;i<list.size();i++)
			{
				dp[i][list.get(i).a+t]=list.get(i).b;				
			}
			for(int i=1;i<list.size();i++)
			{
				for(int j=-t;j<=t;j++)
				{
							dp[i][j+t]=Integer.max(dp[i][j+t], dp[i-1][j+t]);
				if(j+t-list.get(i).a<0||j+t-list.get(i).a>200000)
							continue;
				dp[i][j+t]=Integer.max(dp[i][j+t], dp[i-1][j+t-list.get(i).a]+list.get(i).b);
				
				
				}
			
			}
			int ans=-inf;
			for(int j=0;j<=t;j++)
			{
				ans=Integer.max(ans, dp[list.size()-1][j+t]>=0?j+dp[list.size()-1][j+t]:-inf);
			}
			return ans;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		ArrayList<Num>list=new ArrayList<Num>();
		int a=0,b=0;		
		for(int i=1;i<=n;i++)
		{			
			a=scanner.nextInt();
			b=scanner.nextInt();	
			if(a<0&&b<0)
				continue;
			
				list.add(new Num(a,b));
									
		}
		int ans=f(list);
		if(ans<=0)
			System.out.println(0);
		else {
			System.out.println(ans);
		}
		
	}
}

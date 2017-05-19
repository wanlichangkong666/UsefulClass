import java.util.Scanner;


public class MergeStone {

	public static long min=9999999;
	public static long[][] dp=new long[1001][1001];
	public static long[] stone=new long[1001];
	public static long[] sum=new long[1001];
	public static long  min(long a,long b)
	{
		return a<b?a:b;
	}
	public static long f(int u,int v)
	{
		if(u==v)
			return 0;
		if(dp[u][v]!=0)
			return dp[u][v];
		
	

		for(int k=u;k<v;k++)
		{
			min=min(min,f(u, k)+f(k+1, v)+sum[v]-sum[u-1]);
		}
		return dp[u][v]=min;
	}
	public static void main(String[] args) {
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			stone[i]=scanner.nextInt();		
			sum[i]=sum[i-1]+stone[i];
		}
		System.out.println(f(1,n));
	}
}

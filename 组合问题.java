import java.util.Scanner;


public class 组合问题 {
public static long comb(long n,long m)
{
	long a=1;
	long b=1;
	for(long i=1;i<=m;i++)
	{
		a*=(n--);
		b*=i;
	}
	return (a/b)%987654321;		
}
public static long addUp(long n,long m)
{
	long sum=0;
	for(long i=1;i<=n;i++)
		sum+=(i*i*i%987654321)*(comb(n, i)*comb(n, m)%987654321)%987654321;
	return sum;
}
	public static void main(String[] args) {
	 //System.out.println(comb(3, 2));
		Scanner scanner=new Scanner(System.in);
		long n=scanner.nextLong();
		long m=scanner.nextLong();
		long result=addUp(n, m)%987654321;
		System.out.println(result);
	}

}

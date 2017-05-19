import java.math.BigInteger;
import java.sql.Time;


public class Problem21DaffodilNumbers {
	//��ÿ��i��21�η�
public static BigInteger p(int i){
	BigInteger base=BigInteger.valueOf(i);
	return base.pow(21);	
}
public static void compute(BigInteger[] pw,int[] nn)
{
	BigInteger sum=BigInteger.ZERO;
	for(int i=0;i<10;i++)
	{
		sum=sum.add(pw[i].multiply(BigInteger.valueOf(nn[i])));
	}
	String s=""+sum;
	if(s.length()!=21)return;
	//ȷ�������ֳ��ֵĶ��ٴ�
	int []nn2=new int[10];
	for(int i=0;i<21;i++)
	{
		nn2[s.charAt(i)-'0']++;
	}
	for(int i=0;i<10;i++)
	{
		if(nn[i]!=nn2[i])return;
	}
	System.out.println(s);
}
public static void f(BigInteger[] pw,int[] nn,int cur,int use)
{
	if(cur==9)
	{
		nn[9]=21-use;
		compute(pw, nn);
		return;
	}
	//�Ե�ǰλ�����п��ܽ���ö��
	for(int i=0;i<21-use;i++)
	{
		nn[cur]=i;
		f(pw, nn, cur+1, use+i);
	}
}

	
	public static void main(String[] args) {
	long startTime=System.currentTimeMillis();
	BigInteger pw[]=new BigInteger[10];
	for(int i=0;i<pw.length;i++)
	{
		pw[i]=p(i);
	}
	int nn[]=new int[10];
	f(pw, nn, 0, 0);
	long endTime=System.currentTimeMillis();
	System.out.println((endTime-startTime)/1000f+"��");

	}

}

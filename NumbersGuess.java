import java.awt.List;
import java.util.ArrayList;

import org.omg.PortableInterceptor.INACTIVE;


public class NumbersGuess {
	static ArrayList<String> lis=new ArrayList<String>();
	static ArrayList<String> lis2=new ArrayList<String>();
	//��ʼ������Ϊ1~9
	public static void init(int[] n)
	{
		for(int i=0;i<9;i++)
		{
			n[i]=i+1;
		}
	}
	//�Ƿ��ظ�
	public static boolean isDup(String s1,String s2)
	{
		String a1=s1.substring(0,2);
		String a2=s1.substring(2,4);
		String b1=s2.substring(0,2);
		String b2=s2.substring(2,4);
		if(a1.equals(b2)&&a2.equals(b1))
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	//ȥ��lis�ظ�Ԫ��
	public static void removeDuplicate()
	{
		lis2.add(lis.get(0));
		for(int i=1;i<lis.size();i++)
		{
			boolean flag=true;//����Ƿ��ظ�
			for(int j=0;j<lis2.size();j++)
			{
			flag=isDup(lis.get(i), lis2.get(j));//�ж��Ƿ��ظ�
			if(flag) break;//���Ԫ���ظ���ֱ���������ѭ���������¸�����
			}
			if(!flag)
			{
				lis2.add(lis.get(i));//���ظ��������
			}
		}
	}
	//���
	public static void print()
	{
		for(String s:lis2)
		{
			String a=s.substring(0,2);
			String b=s.substring(2,4);
			String c=s.substring(4,6);
			String d=s.substring(6);
			System.out.println(a+"x"+b+"="+c+"x"+d);
		}
	}
	//��������������������
	public static void check(int[] n)
	{
		StringBuffer sb=new StringBuffer();
		for(int x:n)//��������ת��Ϊ�ַ���
		{
			sb.append(x);
		}
		int a=Integer.parseInt(sb.substring(0,2).toString());
		int b=Integer.parseInt(sb.substring(2,4).toString());
		int c=Integer.parseInt(sb.substring(4,6).toString());
		int d=Integer.parseInt(sb.substring(6).toString());
		if(a*b==c*d)
		{
			lis.add(sb.toString());
		}
	}
	//ȫ���н��в���
	public static void allSort(int[] n,int start,int end)
	{
		if(start>=end)
		{
			check(n);
			return;
		}
		else 
		{
			for(int i=start;i<=end;i++)
			{
				int t=n[start];//����Ԫ��
				n[start]=n[i];
				n[i]=t;
				//�ݹ�ȫ����
				allSort(n, start+1, end);
				t=n[start];//��ԭԪ��
				n[start]=n[i];
				n[i]=t;
			}
		}
	}
	public static void fun()
	{
		int[] n=new int[9];
		init(n);//��ʼ������Ϊ1~9
		allSort(n, 0, n.length-1);//ȫ���в���
		removeDuplicate();//ȥ���ظ�Ԫ��
	}
	public static void main(String[] args) 
	{		
		fun();
		print();//������
	}

}


public class Combination {
	//���������ַ������ַ�����
	static char[] tag;
	static char[] carr;
	//�����ж��ַ������Ƿ񱻷��ʹ��Ĳ�������
	static boolean[] vis;

	public static void main(String[] args) {
		String string= "scadf";
		tag=string.toCharArray();
		vis=new boolean[tag.length];
		carr=new char[3];
		combine(0,0);

	}
	static void combine(int p,int j)
	{
		//���������
		if(p==carr.length)
		{			
			for(char ch:carr)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		else
		{
			for(;j<tag.length;j++)
			{
				if(vis[j]==true)
				continue;
				carr[p]=tag[j];
				vis[j]=true;
				//�ݹ����
				combine(p+1,j);
				vis[j]=false;
				
			}
		}
	}

}

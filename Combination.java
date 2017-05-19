
public class Combination {
	//用来接受字符串的字符数组
	static char[] tag;
	static char[] carr;
	//用来判断字符数组是否被访问过的布尔数组
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
		//组合完便输出
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
				//递归调用
				combine(p+1,j);
				vis[j]=false;
				
			}
		}
	}

}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class π„À—bfs_√‘π¨Œ Ã‚ {
	static Queue<p> queue=new LinkedList<p>();
	static boolean[][] visit=new boolean[501][501];
	static char[][] map=new char[501][501];
	static int n,m;
	static int[][] dir={{0,1},{-1,0},{1,0},{0,-1}};
	static class p{
		 int x;
		 int y;
		 int count;
		 String str;
		public p(int _x,int _y,int _count,String _str)
		{
			x=_x;
			y=_y;
			count=_count;
			str=_str;
		}
	}
	public static boolean check(int x,int y)
	{
		if(x<0||x>=m||y<0||y>=n||visit[y][x])
			return false;
		return true;
	}
	
	public static void bfs()
	{
		p tp=new p(0, 0, 0, "");
		
		while(!queue.isEmpty())
		{
			queue.poll();
		}
		queue.add(tp);		
		visit[0][0]=true;
		while(!queue.isEmpty())
		{
			p np=queue.poll();
			for(int i=0;i<4;i++)
			{
				int cx=dir[i][0];
				int cy=dir[i][1];
				int nx=np.x+cx;
				int ny=np.y+cy;
				String ts="";
				if(check(nx, ny))
				{
					switch (cx) {
					case -1:
						ts="L";
						break;
					case 1:
						ts="R";
						break;
					default:
						break;
					}
					switch (cy) {
					case -1:
						ts="U";
						break;
					case 1:
						ts="D";
						break;
					default:
						break;
					}
					if(nx==m-1&&ny==n-1)
					{
						System.out.println(np.count+1);
						System.out.println(np.str+ts);
					}
					queue.add(new p(nx, ny, np.count+1,np.str+ts));
					visit[ny][nx]=true;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
		 m=scanner.nextInt();	
		 scanner.nextLine();
		
		for(int i=0;i<n;i++)
		{			
				String in=scanner.nextLine();
				map[i]=in.toCharArray();
				for(int j=0;j<m;j++)
				if(map[i][j]=='1')
				visit[i][j]=true;			
		}
		/*for(int i=0;i<n;i++)
		{			
				System.out.println(map[i]);	
		}
		for(int i=0;i<n;i++)
		{			
				for(int j=0;j<m;j++)
					System.out.print(visit[i][j]);
				System.out.println();
		}*/
		bfs();
	}
}

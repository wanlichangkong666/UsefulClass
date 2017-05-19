import java.util.Scanner;


public class ScoresQuestion {

	
	public static void main(String[] args) {
		ScoresQuestion sq=new ScoresQuestion();
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		int N;
		int scores[];
		int M;
		int results[];
		int count=0;
		Visit visit[];
		for(int i=0;i<T;i++)
		{
			 N=in.nextInt();
			 scores=new int[N];
			 M=in.nextInt();
			 results=new int[M];
			 visit=new Visit[M];
			for(int j=0;j<N;j++)
			{
				scores[j]=in.nextInt();
			}
			for(int k=0;k<M;k++)
			{
				visit[k]=sq.new Visit();
				visit[k].L=in.nextInt();
				visit[k].H=in.nextInt();
			}
			for(int k=0;k<M;k++)
			{
				if(visit[k].L>=visit[k].H)
					System.out.println(-1);
				else
					{
					for(int l=0;l<N;l++)
					{
						if(scores[l]>=visit[k].L&&scores[l]<=visit[k].H)
							count++;
					}
					System.out.println(count);
					count=0;
					}
			}							
		}
	}
	class Visit{
		public int L;
		public int H;
	}

}

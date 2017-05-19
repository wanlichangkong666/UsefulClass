import java.util.Scanner;
import java.util.function.IntToDoubleFunction;


public class MatchProblem {
	public static boolean isOk(char[][] state, int i,int j){
		boolean ok1=true,ok2=true;
     if(state[i][j]=='-'){
    	 for(int j2=j+1;j2<4;j2++)
    	 {
    		 if(state[i][j2]=='-')
    		 {
    			 ok1=false;
    			 break;
    			 
    		 }    			 
    		 else if (state[i][j2]=='1') {
    			 ok1=true;
    			 break;
				
			}
    	 }
    	 for(int j2=j-1;j2>=0;j2--){
    		 if(state[i][j2]=='-'){
    			ok2=false;
    			break;
    		 }
    		 else if (state[i][j2]=='1') {
    			 ok2=true;
    			 break;
				
			}
    	 }
    	
    	return ok1&&ok2;
     }
     else if(state[i][j]=='1')
     {
      	 for(int i2=i+1;i2<3;i2++)
    	 {
    		 if(state[i2][j]=='-')
    		 {
    			 ok1=true;
    			 break;
    		 }    			 
    		 else if (state[i2][j]=='1') {
    			 ok1=false;
    			 break;
				
			}
    	 }
    	 for(int i2=i-1;i2>=0;i2--){
    		 if(state[i2][j]=='-')
    		 {
    			 ok2=true;
    			 break;
    		 }    			 
    		 else if (state[i2][j]=='1') {
    			 ok2=false;		
    			 break;
			}
    	 }
    	 
    	 return ok1&&ok2;
     }
     return true;
	}
	private  static void  getResult(char[][] state) {
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++)
			{
				if(state[i][j]=='0'){
					state[i][j]='-';
							if(isOk(state, i, j)){
								System.out.println(i+""+j+'-');
								return;
							}
							state[i][j]='0';
							state[i][j]='1';
							if(isOk(state, i, j)){
								System.out.println(i+""+j+'1');
								return;
						
							}
							state[i][j]='0';
				}
			}
		}
			
		
	}

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		char[][] state=new char[3][4];
		String s;
		while((n--)>0){
			for(int i=0;i<3;i++){
				s=scanner.nextLine();
				for(int j=0;j<4;j++){
					state[i][j]=s.charAt(j);
				}
			}
			getResult(state);
			
		}
	}

}

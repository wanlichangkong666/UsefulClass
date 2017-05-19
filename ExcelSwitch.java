import java.util.Scanner;
import java.util.Stack;


public class ExcelSwitch {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    in.nextLine();//必须加上，不然会导致输入不准确
	    while(n>0)
	    {
	    	String string=in.nextLine();
	    	String strings[]=string.split("C");
	    	strings[0]=strings[0].substring(1,strings[0].length());
	    	int row=Integer.parseInt(strings[0]);
	    	int col=Integer.parseInt(strings[1]);//获取行数和列数
	    	/*
	    	 * 对列数进行变换
	    	 */
	    	Stack<Character>stack=new Stack<Character>();
	    	while(col>0)
	    	{
	    		if(col%26==0)
	    		{
	    			stack.push('z');
	    			col=col/26-1;
	    		}
	    		else {
					stack.push((char)('A'-1+col%26));
					col=col/26;
					
				}
	    	}
	    	while(!stack.empty())
	    	{
	    		System.out.print(stack.pop());
	    	}
	    	System.out.println(row);
	    	n--;
	    }

	}

}

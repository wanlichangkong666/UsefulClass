import java.util.Scanner;
import java.util.Stack;


public class ExcelSwitch {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    in.nextLine();//������ϣ���Ȼ�ᵼ�����벻׼ȷ
	    while(n>0)
	    {
	    	String string=in.nextLine();
	    	String strings[]=string.split("C");
	    	strings[0]=strings[0].substring(1,strings[0].length());
	    	int row=Integer.parseInt(strings[0]);
	    	int col=Integer.parseInt(strings[1]);//��ȡ����������
	    	/*
	    	 * ���������б任
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

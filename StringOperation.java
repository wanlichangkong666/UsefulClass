import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StringOperation {

	public static void main(String[] args) {
		String str="";
		str=(new Scanner(System.in).nextLine());
		String []str1=str.split("[ ]+");
		for(int i=0;i<str1.length;i++)
			str1[i]=String.valueOf((char)(str1[i].charAt(0)+('A'-'a')))+str1[i].substring(1);
		String s="";
		for(int i=0;i<str1.length-1;i++)
		{
			s+=str1[i]+" ";
		}
          s+=str1[str1.length-1];
          Pattern p=Pattern.compile("([0-9]+)");
          Matcher m=p.matcher(s);
          String fin="";
          int st=0;
          while(m.find())
          {
        	  int start=m.start();
        	  int end=m.end();
        	  fin+=s.substring(st,start);
        	  if(s.charAt(start-1)!=' ')
        		  fin+="_";
        	  fin+=m.group(1);
        	  if(s.charAt(end)!=' ')
        		  fin+="_";
        	  st=end;
          }
          if(st<s.length())
        	  fin+=s.substring(st);
          System.out.println(fin);
	}

}

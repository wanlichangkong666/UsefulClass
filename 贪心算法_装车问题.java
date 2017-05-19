import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

import javax.naming.ldap.SortControl;


public class 贪心算法_装车问题 {
	static class Values implements Comparable<Values>
	{
		int weight;
		double value;
		public Values(int weight,double value)
		{
			this.weight=weight;
			this.value=value;
		}
		public int compareTo(Values o) {
			if(o instanceof Values)
			{
			    double cmp=value-o.value;
			    if(cmp>0)
			    	return 1;
			    else if(cmp<0)
			    	return -1;
			    else return 0;
			
			}
			return 0;
			
		}

	
	}
	

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int w=scanner.nextInt();
		int[] cargoWeight=new int[n];
		int[] cargoValue=new int[n];
		Values[] values=new Values[n];
		

		for(int i=0;i<n;i++)
		{
			cargoWeight[i]=scanner.nextInt();
			cargoValue[i]=scanner.nextInt();
			values[i]=new Values(cargoWeight[i], cargoValue[i]*1.0/cargoWeight[i]);
		
		}		
       Arrays.sort(values);
 
      double sum=0.0;
       for(int i=n-1;i>=0;i--)
       {
    	   if(w<=values[i].weight)
    	   {
    		   sum+=w*values[i].value;
    		   
    		   break;
    	   }
    	   else{
    		   sum+=values[i].value*values[i].weight;
    		   w-=values[i].weight;
    	   }
       }
       System.out.println(String.format("%.1f", sum));
       
	}

}

import java.util.Scanner;
public class TheMaxProduct {
static int N=4;
static int K=2;
	
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
N=scanner.nextInt();
K=scanner.nextInt();
String str=scanner.next();
System.out.println(N);
System.out.println(K);
System.out.println(str);
int array[]=strToArray(str);
System.out.println(getResult(array,0,K));
}
static int[] strToArray(String str)
{
 int array[]=new int[N];
 for(int i=0;i<str.length();i++)
	 array[i]=str.charAt(i)-48;
 return array;
}
static int getResult(int array[],int begin,int k)
{
	int x=0;
	int result=0;
if(k==0)
	return getIntFromArray(array,begin,array.length-1);
else 
{
for(int i=0;i<array.length;i++)
	 x=getIntFromArray(array,begin,i)*getResult(array,i+1,k-1);
		if(x>result)
			result=x;
		return result;
}


}
static int getIntFromArray(int array[],int begin,int i)
{
int sum=0;
while(begin<=i)
{
	
sum=sum*10+array[begin];
begin++;

}
return sum;
}
}

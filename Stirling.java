
import java.util.Scanner; 
public class Stirling{ 
    public static void main(String[] args) 
    { 
        Scanner cin; int n,k; 
        cin=new Scanner(System.in); 
        n=cin.nextInt(); k=cin.nextInt(); 
        System.out.println(Stirling(n,k)); 
    } 
 
    public static int Stirling(int n, int k) 
    { 
        if(k==1||n==k) return 1;    
        else if(n<k) return 0;
        else return Stirling(n-k, k)+Stirling(n-1, k-1); 
    } 
}

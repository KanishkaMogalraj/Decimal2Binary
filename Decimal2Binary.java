import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n;
        long  d[]=new long [64];
        n=s.nextInt();
        if((n>=0) && (n<=100000))
        {
            int i=0;
            while(n!=0)
            {
                d[i]=(long) n%2;
                n=n/2;
                i++;
                
            }
            for(int k=i-1;k>=0;k--)
            {
                System.out.print(d[k]);
            }
        }

	}
}

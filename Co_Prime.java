import java.util.*;
public class Co_Prime
 {

	static boolean prime(int n)
	{
		boolean flag =true;
		if(n<=1)
		{
			flag = false;
			return flag;
		}
		else
		{
		for(int i = 2; i<=n/2; i++)
		{
			if(n%i ==0)
				{flag = false;
	            break;
				}
		}
		
		return flag ;
	}
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
	    int x = s.nextInt();
	    int y = s.nextInt();
	    int count = 0;
	    int  a,b;
	    s.close();
	    for(int i = x; i+2 <= y; i++)
	    {
	    	a= i;
	    	b = i+2;
	    	if(prime(a)&&prime(b))
	    	{
	    		System.out.println("("+a+","+b+")");
	    		count = 1;
	    	}
	    }
		if(count == 0)
			System.out.println("-1");
	}
	
}
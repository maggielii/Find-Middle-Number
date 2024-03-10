package code;

public class FindMiddleNumber {
	
	public static int middle(int n1, int n2, int n3)
	{
		int middle = 0;
		if(n1 > n2 && n1 > n3)
		{
			if(n2>n3)
				middle = n2;
			if(n3>n2)
				middle = n3;
		}
		if(n2 > n1 && n2 > n3)
		{
			if(n1>n2)
				middle = n1;
			if(n3>n2)
				middle = n3;
		}
		if(n3 > n1 && n3 > n2)
		{
			if(n1>n2)
				middle = n1;
			if(n2>n1)
				middle = n2;
		} 	
		if(n1 == n2)
			middle = n1;
		if(n1 == n3)
			middle = n1;
		if(n2 == n3)
			middle = n2;
		return middle;
	}


	public static void main(String[] args) 
	{
		
		System.out.println( middle(2,2,7) );
		
	}

}

public class PositiveNegativeZero{
    public static void main(String[]args)
         { checkNumber(12);
           checkNumber(-12);
           checkNumber(0);
		   }	

    public static void checkNumber(int n)
	{ 
	if (n>0){
	System.out.println("positive");
	}
	else if (n<0)
	{System.out.println("negative");
	}else 
	System.out.println("zero");
     }
}	 
	 
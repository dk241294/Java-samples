public class MathOperation
{ public static void main(String[] arg)
  { int result=1+2;
    System.out.println("1+2=" + result);
	
	int previousResult=result;
	result=result-1;
	System.out.println( previousResult + "-1=" + result);
	
	previousResult=result;
	result=result*10;
	System.out.println( previousResult + "*10=" + result);
	
	previousResult=result;
	result=result/3;
	System.out.println( previousResult + "/3=" + result);
	
	previousResult=result;
	result=result%3;
	System.out.println(previousResult +" %3"  +result);
	
	result++;
	System.out.println("result is now="  +result);
	
	result--;
	System.out.println("result is now="  +result);
	
	result +=2;
	System.out.println("result is now="  +result);
	
	result *=10;
	System.out.println("result is now="  +result);
	
	result -=6;
	System.out.println("result is now="  +result);
	
	result /=2;
	System.out.println("result is now="  +result);
	
	result %=2;
	System.out.println("result is now="  +result);
	
	boolean b=true;
	if(b==false)
		System.out.println("line will  be not executed");
	
	int a=100;
	if(a==100);
			System.out.println("max score");
			
	if (a<=100 && a==1000)
					System.out.println("not executed");
				
	if (a<=100 || a==1000)
	 System.out.println("will be executed");



	
  }
}
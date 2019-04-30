public class Cascading
{public static void main(String[]args)
	{
byte byteValue=20;
short shortvalue=30;
int intvalue=60;
int b=(byteValue+shortvalue+intvalue);
long longValue=50l+10l*b;
short newShortValue= (short) b; // cascading otherwise taken int as default
byte a=(byte) b;
System.out.println(" newlongvalue=" + longValue);
System.out.println(" newshortvalue=" + newShortValue);
System.out.println(" newbytevalue=" + a);
float f= 25f/3f;//single  precision
int i=25/3;
double d=25d/3d;//double precision

System.out.println("f="+f);
System.out.println("i="+i);
System.out.println("d="+d);

}

}
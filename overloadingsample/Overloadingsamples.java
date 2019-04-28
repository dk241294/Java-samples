class P
{public void f(int a)
{System.out.println("class P");
}
}
class Q extends P
{public void f(int a)
{System.out.println("class Q"); // function overloading
}}
public  class OverloadingSamples
{
public static void main(String [] args){
Q obj=new Q();
obj.f(12); // this will call class Q function because of overriding
}
}
class Box
{ private int length ,breadth,height;
public void setdimension(int l,int b,int h)
{length= l;
breadth= b;
height= h;
}
public void showdimension()
{System.out.println("lenght" +length);
System.out.println("breadth" +breadth);
System.out.println("height" +height);
}
}
class BoxDimension
{public static void  main(String[] args)
{Box smallbox=new Box();
smallbox.setdimension(10,20,30);
smallbox.showdimension();
}
}
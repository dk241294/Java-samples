public class Box {
    double length;
    double width;
    double height;

    Box(double w, double h, double l)     //constructor with all dimension
    {
        width = w;
        height = h;
        length= l;
    }


    Box()
    {
        width = height = length = 0;     //constructor with no dimension
    }

    Box(double len)                              //constructor with one dimension (in case of cube)
    {
        width = height = length = len;
    }

    Box(double length ,double width){
        this.length=this.height=length;
        this.width=width;
    }
    double volume()
    {
        return width * height * length;
    }


}




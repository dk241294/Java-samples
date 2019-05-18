public class Main {
    public static void main(String[] args) {

    Circle circle = new Circle(2);
    Cylinder cylinder=new Cylinder(1,12);
    System.out.println(" radius of circle "+circle.getRadius());
    System.out.println(" area of circle "+ circle.getArea());
    System.out.println(" radius of cylinder  "+ cylinder.getRadius());
    System.out.println(" height of cylinder "+ cylinder.getHeight());
    System.out.println(" cylinder area "+cylinder.getArea());
    System.out.println(" volume of cylinder "+ cylinder.getVolume());

}
}

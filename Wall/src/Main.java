public class Main {
    public static void main(String[] args) {
        Wall wall=new Wall(5,4); //constructor
        System.out.println("area=  "+wall.getArea());
        wall.setHeight(-1.5);
        wall.setWidth(-1.2);
        System.out.println("height= " + wall.getHeight());
        System.out.println("width=  " + wall.getWidth());
        System.out.println("area=  "+wall.getArea());


        wall.setHeight(1.5);
        wall.setWidth(1.2);
        System.out.println("height= " + wall.getHeight());
        System.out.println("width=  " + wall.getWidth());
        System.out.println("area=  "+wall.getArea());


    }
}

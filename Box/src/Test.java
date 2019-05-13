public class Test {

    public static void main(String args[])
    {
        // create boxes using the various
        // constructors
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box cuboid=new Box(2,3);


        System.out.println(" Volume of mybox1 is " +mybox1. volume());
        System.out.println(" Volume of mybox2 is " + mybox2.volume());
        System.out.println(" Volume of mycube is " + mycube.volume());
        System.out.println(" Volume of cuboid is "+ cuboid.volume());
    }
}


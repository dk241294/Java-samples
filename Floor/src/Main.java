public class Main {
    public static void main(String[] args) {
        Carpet carpet=new Carpet(2.5);
        Floor floor=new Floor(1.5,6.5);
        Calculator calculator=new Calculator(floor,carpet);
        System.out.println(" total " + calculator.getTotalCost());

        System.out.println("-----------------------------------------------");

        carpet=new Carpet(105);
        floor=new Floor(20,32);
        calculator=new Calculator(floor,carpet);
        System.out.println(" total  " +calculator.getTotalCost());

    }
}

public class Main {
    public static void main(String[] args) {

    FruitDetails fruit = new FruitDetails("Apple",30,"Red","sweet");

    System.out.println("Name:  "+ fruit.getName()+"  Price: "+fruit.getPrice()+"   Color: "+fruit.getColor()+"   Taste: "+fruit.getTaste());


    fruit.setColor("Green");
    fruit.setPrice(32);
    fruit.setTaste("sour");

    System.out.println("Values of Apple after updation");
    System.out.println("Name:  "+ fruit.getName()+"  Price:  "+fruit.getPrice()+"  Color:  "+fruit.getColor()+ "  Taste:  "+fruit.getTaste());

    fruit.setName("Avocado");
    fruit.setColor("Brown");
    fruit.setPrice(100);
    fruit.setTaste("Bitter");

        System.out.println("Name:  "+fruit.getName()+"  price:  "+ fruit.getPrice()+"  color:  "+fruit.getColor()+"  Taste:  "+fruit.getTaste());

    }
}

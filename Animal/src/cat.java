class Cat extends Animal{

    private String color;

    public Cat( String food, int legs) {
        super( food, legs);
        this.color="White";
    }

    public Cat( String food, int legs, String color){
        super( food, legs);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        Cat cat = new Cat("milk", 4, "black");


        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());



    }
}
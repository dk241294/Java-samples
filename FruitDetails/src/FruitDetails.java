public class FruitDetails
{

    private String name;
    private double price;
    private String color;
    private String taste;

    public FruitDetails(String name, double price, String color,String taste)
    {
        this.name = name;
        this.price = price;
        this.color = color;
        this.taste=taste;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void  setTaste(String taste){
        this.taste=taste;
    }


    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public String getColor()
    {
        return color;
    }
    public String getTaste(){
    return taste;
    }
}

public class Main {
    public static void main(String []args){
        Person person= new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(12);
        System.out.println("Full Name  "+person.getFullName());
        System.out.println("isteen  " + person.isTeen());
        System.out.println("------------------------------------------------------------");
        person.setLastName("kumar  ");
        person.setFirstName("deepak  ");
        person.setAge(42);
        System.out.println("Full Name  "+person.getFullName());
        System.out.println("isteen  " + person.isTeen());
        System.out.println("------------------------------------------------------------");
        person.setLastName("smith  ");
        person.setFirstName(" ");
        person.setAge(101);
        System.out.println("Full Name  "+person.getFullName());
        System.out.println("isteen  " + person.isTeen());

    }
}

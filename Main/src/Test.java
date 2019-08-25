public class Test extends Main {
     public void a(){
         super.a();
        System.out.println("test class method");
    }
    void a(int b){
        System.out.println("parameter 1");

    }
    void a(int a,String b) {
        System.out.println("parameter 2");
    }
    public static void main(String[] args) {
        Test x=new Test();
        x.a();
        Main y=new Main();
        y.a();
        x.a('1',"2");

}
}


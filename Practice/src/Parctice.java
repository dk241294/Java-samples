public class Parctice {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int i=1;i<=1000;i++){
            if((i%3==0)&&(i%5==0)) {
                count++;
                sum = sum + i;
                System.out.println(i);
            }
             if(count==5){
                    break;}



        }
        System.out.println(sum+"sum");

    }}

//    public static void Main () {
//        for(int i=0;i<=5;i++){
//            System.out.println("interst rate"+i+"is");
//        }
//
//
//    }
//
//  //

public class Main {
    public static void main(String[] args) {
        SimpleCalculation obj = new SimpleCalculation();
        obj.setFirstNumber(0);
        obj.setSecondNumber(30);
        System.out.println("Addition of two Number=" +obj.getAdditionResult());
        System.out.println("subtraction of two Numbe=r"+obj.getSubtractionResult());
        System.out.println("multiplication of two number" +obj.getMultiplicationResult());
        System.out.println("division of two number"+obj.getDivisionResult().getValue());
        System.out.println();
        obj.setFirstNumber(40);
        obj.setSecondNumber(40);
        System.out.println("Addition of two Number=" +obj.getAdditionResult());
        System.out.println("subtraction of two Numbe=r"+obj.getSubtractionResult());
        System.out.println("multiplication of two number" +obj.getMultiplicationResult());
        System.out.println("division of two number"+obj.getDivisionResult().getValue());
        System.out.println();
    }
}
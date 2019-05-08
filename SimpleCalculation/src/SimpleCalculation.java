public class SimpleCalculation {
    private double firstNumber;
    private double secondNumber;
    public double setFirstNumber(double firstNumber){
        this.firstNumber=firstNumber;
        return this.firstNumber;
    }
    public double setSecondNumber(double secondNumber){
        this.secondNumber=secondNumber;
        return this.secondNumber;
    }public double getFirstNumber(){
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber+this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }
    public Result getDivisionResult(){
        if(this.firstNumber==0){

            return  new Result(0,"not possible to divide");
        }else{
            return  new Result( this.secondNumber/this.firstNumber,"sucessfully");
        }
    }
}
package SumCalculatorCodingEx29;

public class SimpleCalculator {
   private double firstNumber;
   private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double sum= this.firstNumber + this.secondNumber;
        return sum;
    }
    public double getSubtractionResult(){
        return this.firstNumber-this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber*this.secondNumber;
    }
    public double getDivisionResult(){
        return this.firstNumber*this.secondNumber;
    }

}

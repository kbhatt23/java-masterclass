package basics;
public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
     public double getSecondNumber(){
        return this.secondNumber;
    }
      public void setFirstNumber(double a){
        this.firstNumber = a;
    }
     public void setSecondNumber(double b){
        this.secondNumber = b;
    }
     
     public double getAdditionResult() {
    	 return this.firstNumber+this.secondNumber;
     }
     
     public double getSubtractionResult() {
    	 return this.firstNumber - this.secondNumber;
     }
     
     public double getMultiplicationResult() {
    	 return this.firstNumber * this.secondNumber;
     }
     public double getDivisionResult() {
    	 if(firstNumber==0 || secondNumber == 0) {
    		 return 0;
    	 }
    	 return this.firstNumber/this.secondNumber;
     }
}
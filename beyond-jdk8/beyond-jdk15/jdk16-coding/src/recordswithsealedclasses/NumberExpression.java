package recordswithsealedclasses;

public record NumberExpression(double number) implements Expression{

    @Override
    public double evaluate(){
        return this.number;
    }
}

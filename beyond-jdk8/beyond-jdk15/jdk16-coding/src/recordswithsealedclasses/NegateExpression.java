package recordswithsealedclasses;

public record NegateExpression(Expression expression) implements Expression{

    public double evaluate(){
        return -expression.evaluate();
    }
}

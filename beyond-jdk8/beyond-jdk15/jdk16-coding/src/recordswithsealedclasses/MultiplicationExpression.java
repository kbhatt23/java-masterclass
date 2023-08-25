package recordswithsealedclasses;

public record MultiplicationExpression(Expression first, Expression second) implements Expression{

    public double evaluate(){
        return first.evaluate() * second.evaluate();
    }
}

package recordswithsealedclasses;

public record AdditionExpression(Expression first, Expression second) implements Expression {

    public double evaluate(){
        return this.first.evaluate()  + this.second.evaluate();
    }
}

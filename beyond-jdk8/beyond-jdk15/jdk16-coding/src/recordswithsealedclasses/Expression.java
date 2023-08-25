package recordswithsealedclasses;

public sealed interface Expression permits NumberExpression,
        AdditionExpression,NegateExpression, MultiplicationExpression{
    double evaluate();
}

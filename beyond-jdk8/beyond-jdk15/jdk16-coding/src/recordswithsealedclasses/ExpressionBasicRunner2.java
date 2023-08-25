package recordswithsealedclasses;

public class ExpressionBasicRunner2 {
    public static void main(String[] args) {
        Expression numberExpression1 = new NumberExpression(2);

        Expression numberExpression2 = new NumberExpression(5);

        Expression additionExpression = new AdditionExpression(new NegateExpression(numberExpression1), numberExpression2);
        System.out.println(additionExpression.evaluate());
    }
}

package exampleproject;

public class Calculator {
    private String operator;

    public Calculator(String operator) {
        if (!checkValidOperator(operator))
            throw new IllegalArgumentException("Invalid operator");

        this.operator = operator;
    }

    private boolean checkValidOperator(String operator) {
        return "+-/*".indexOf(operator) != -1 && operator.length() == 1;
    }

    public String getOperator() {
        return operator;
    }

    public int calculate(int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}

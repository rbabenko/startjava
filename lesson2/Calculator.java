package lesson2;

public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public Calculator(int a, int b, char sign) {
        this.a = a;
        this.b = b;
        this.sign = sign;
    }

    public void execute() {
        switch (sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '^':
                result = pow(a, b);
                break;
        }
    }

    private int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public char getSign() {
        return sign;
    }

    public int getResult() {
        return result;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return a + " " + sign + " " + b + " = " + result;
    }
}

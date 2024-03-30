package Arithmetic;

public class Arithmetic<E extends Number> {
    E num1;
    E num2;

    public Arithmetic(E num1, E num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public Number add() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() + num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() + num2.longValue();
        } else {
            return num1.intValue() + num2.intValue();
        }
    }

    public Number subtract() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() - num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() - num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() - num2.longValue();
        } else {
            return num1.intValue() - num2.intValue();
        }
    }

    public Number multiply() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() * num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() * num2.longValue();
        } else {
            return num1.intValue() * num2.intValue();
        }
    }

    public Number divide() {
        if(num2.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by 0");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin() {
        if (num1.doubleValue() <= num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

    public Number getMax() {
        if (num1.doubleValue() >= num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }
}
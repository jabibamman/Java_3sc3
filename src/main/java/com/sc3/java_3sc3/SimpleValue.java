package com.sc3.java_3sc3;

import java.util.function.IntUnaryOperator;

public class SimpleValue {
    public static void main(String[] args) {
        System.out.println("____");

        SimpleValue simpleValue = new SimpleValue(2);
        IntUnaryOperator powOf2 = number -> (int) Math.pow(number, 2);

        simpleValue.apply(powOf2);

        System.out.println("ici la reponse : " + simpleValue.getValue());
        System.out.println("____");

        simpleValue.apply(powOf2);
        System.out.println("ici la reponse : " + simpleValue.getValue());

    }

    private int value;

    public SimpleValue(int value) {
        this.value = value;
    }

    public void apply(SimpleOperation os) {
        value = os.calculate(value);
    }

    public void apply(IntUnaryOperator os) {
        value = os.applyAsInt(value);
    }

    public int getValue() {
        return value;
    }
}

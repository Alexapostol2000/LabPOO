package com.oop_pub.exceptions.ex2_3;

import java.util.Collection;

public interface Calculator {
    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);

    class NullParameterException extends RuntimeException {
    }

    class UnderflowException extends RuntimeException {
    }

    class OverflowException extends RuntimeException {
    }
}

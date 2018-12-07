package bcu.hubertdudowicz.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Constant extends Expression {
    double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        return value;
    }

    @Override
    public Set<String> freeVariables() {
        return Collections.unmodifiableSet(new HashSet<String>());
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}

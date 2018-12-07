package bcu.HubertDAndTillyD.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Pair programming with Hubert Dudowicz and Tilly Davies
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

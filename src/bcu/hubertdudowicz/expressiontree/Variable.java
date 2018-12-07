package bcu.hubertdudowicz.expressiontree;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Pair programming with Hubert Dudowicz and Tilly Davies
public class Variable extends Expression {
    String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public double evaluate(Map<String, Double> variables) {
        if (!variables.containsKey(name)){
            throw new IllegalArgumentException();
        }
        return variables.get(name);
    }

    @Override
    public Set<String> freeVariables() {
        Set<String> set = new HashSet<>();
        set.add(name);
        return Collections.unmodifiableSet(set);
    }

    @Override
    public String toString() {
        return name;
    }
}

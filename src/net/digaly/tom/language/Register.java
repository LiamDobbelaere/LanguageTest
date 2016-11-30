package net.digaly.tom.language;

import net.digaly.tom.language.Variable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class Register
{
    private List<Variable> variables;

    public Register() {
        this.variables = new ArrayList<>();
    }

    public void add(Variable variable) {
        this.variables.add(variable);
    }

    public Variable get(String variableName) {
        for (Variable variable : variables) {
            if (variable.getName().equals(variableName))
            {
                return variable;
            }
        }

        return null;
    }
}

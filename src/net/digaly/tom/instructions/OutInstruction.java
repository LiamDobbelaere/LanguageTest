package net.digaly.tom.instructions;

import net.digaly.tom.language.Register;
import net.digaly.tom.language.Variable;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class OutInstruction implements Instruction
{
    private String variableName;

    public OutInstruction(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public void execute(Register register)
    {
        if (register.get(variableName) != null) {
            System.out.println(register.get(variableName).getType().getValue().toString());
        } else {
            System.out.println(variableName);
        }
    }
}

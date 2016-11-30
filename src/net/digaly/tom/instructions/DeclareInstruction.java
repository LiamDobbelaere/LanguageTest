package net.digaly.tom.instructions;

import net.digaly.tom.types.Type;
import net.digaly.tom.language.Register;
import net.digaly.tom.language.Variable;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class DeclareInstruction implements Instruction
{
    private Variable newVariable;

    public DeclareInstruction(Type type, String name) {
        this.newVariable = new Variable(type, name);
    }

    @Override
    public void execute(Register register)
    {
        register.add(newVariable);
    }
}

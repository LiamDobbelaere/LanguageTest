package net.digaly.tom.instructions;

import net.digaly.tom.language.Register;
import net.digaly.tom.types.Type;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class AddInstruction implements Instruction
{
    private String leftOperand;
    private String rightOperand;

    public AddInstruction(String leftOperand, String rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public void execute(Register register)
    {
        if (register.get(leftOperand) == null) {
            throw new RuntimeException("Left operand must be a variable");
        }

        Type type = register.get(leftOperand).getType();

        type.setValue(Integer.parseInt(type.getValue().toString()) + Integer.parseInt(rightOperand));
    }
}

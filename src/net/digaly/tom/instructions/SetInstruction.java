package net.digaly.tom.instructions;

import net.digaly.tom.language.Register;
import net.digaly.tom.types.Type;

/**
 * Created by tomdo on 30/11/2016.
 */
public class SetInstruction implements Instruction {

    private String leftOperand;
    private String rightOperand;

    public SetInstruction(String leftOperand, String rightOperand) {
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

        type.setValue(rightOperand);
    }
}

package net.digaly.tom.instructions;

import net.digaly.tom.language.Register;
import net.digaly.tom.types.Type;

/**
 * Created by tomdo on 30/11/2016.
 */
public class MultiplyInstruction implements Instruction {
    private String leftOperand;
    private String rightOperand;

    public MultiplyInstruction(String leftOperand, String rightOperand) {
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

        Integer integer = 0;

        if (register.get(rightOperand) != null) {
            integer = (Integer) register.get(rightOperand).getType().getValue();
        } else {
            integer = Integer.parseInt(rightOperand);
        }

        type.setValue(Integer.parseInt(type.getValue().toString()) * integer);
    }
}

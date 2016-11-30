package net.digaly.tom.instructions;

import net.digaly.tom.types.TypeFactory;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class InstructionFactory
{
    private TypeFactory typeFactory;

    public InstructionFactory() {
        this.typeFactory = new TypeFactory();
    }

    public Instruction instructionFrom(String[] instructionParts) {
        switch (instructionParts[0]) {
            case "declare":
                return new DeclareInstruction(typeFactory.typeFrom(instructionParts[1]), instructionParts[2]);
            case "out":
                return new OutInstruction(instructionParts[1]);
            case "add":
                return new AddInstruction(instructionParts[1], instructionParts[2]);
            case "mul":
                return new MultiplyInstruction(instructionParts[1], instructionParts[2]);
            case "set":
                return new SetInstruction(instructionParts[1], instructionParts[2]);
        }

        return new NoInstruction();
    }
}

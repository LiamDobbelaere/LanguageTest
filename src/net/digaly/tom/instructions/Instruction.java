package net.digaly.tom.instructions;

import net.digaly.tom.language.Register;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public interface Instruction
{
    void execute(Register register);
}

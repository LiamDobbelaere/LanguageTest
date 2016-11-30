package net.digaly.tom.interpreter;

import net.digaly.tom.TomInputStream;
import net.digaly.tom.instructions.Instruction;
import net.digaly.tom.instructions.NoInstruction;
import net.digaly.tom.language.Register;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class TomVM
{
    List<Instruction> instructionList;
    Register register;

    public TomVM(String inputFileName) throws IOException
    {
        this.instructionList = new ArrayList<>();
        this.register = new Register();

        TomInputStream bis = new TomInputStream(new FileInputStream(inputFileName));

        Instruction nextInstruction = bis.nextInstruction();

        while (!(nextInstruction instanceof NoInstruction)) {
            instructionList.add(nextInstruction);

            nextInstruction = bis.nextInstruction();
        }
    }

    public void run() {
        for (Instruction instruction : instructionList) {
            instruction.execute(register);
        }
    }

    public Register getRegister()
    {
        return register;
    }
}

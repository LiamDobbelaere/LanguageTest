package net.digaly.tom;

import net.digaly.tom.instructions.Instruction;
import net.digaly.tom.instructions.InstructionFactory;
import net.digaly.tom.instructions.NoInstruction;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class TomInputStream extends FilterInputStream
{
    private InstructionFactory instructionFactory;

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public TomInputStream(InputStream in)
    {
        super(in);

        this.instructionFactory = new InstructionFactory();
    }

    public Instruction nextInstruction() throws IOException
    {
        String out = "";

        int currentCharNumber = this.read();

        while (currentCharNumber != -1 && currentCharNumber != 10) {
            if (currentCharNumber == 13) {
                currentCharNumber = this.read();
                continue;
            }

            char currentChar = (char) currentCharNumber;

            out += currentChar;

            currentCharNumber = this.read();
        }

        out = out.replaceAll("\\s{2,}", " ").trim();

        String[] instructionParts = out.split(" ");

        return instructionFactory.instructionFrom(instructionParts);
    }
}

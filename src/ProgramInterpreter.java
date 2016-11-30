import net.digaly.tom.TomInputStream;
import net.digaly.tom.interpreter.TomVM;
import net.digaly.tom.language.Register;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class ProgramInterpreter
{
    private static Register register;

    public static void main(String[] args) throws IOException
    {
        register = new Register();

        Scanner scanner = new Scanner(System.in);
        TomInputStream inputStream = new TomInputStream(System.in);

        while (true) {
            inputStream.nextInstruction().execute(register);
        }

    }
}

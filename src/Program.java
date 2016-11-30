import net.digaly.tom.interpreter.TomVM;

import java.io.IOException;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class Program
{
    public static void main(String[] args) throws IOException
    {
        TomVM vm = new TomVM("resources/test.tom");

        vm.run();
    }
}

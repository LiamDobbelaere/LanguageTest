package net.digaly.tom.language;

import net.digaly.tom.types.Type;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class Variable
{
    private String name;
    private Type type;

    public Variable(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public Type getType()
    {
        return type;
    }
}

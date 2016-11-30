package net.digaly.tom.types;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class UndefinedType implements Type
{
    @Override
    public void setValue(Object value)
    {

    }

    @Override
    public Object getValue()
    {
        return null;
    }
}

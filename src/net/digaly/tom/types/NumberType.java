package net.digaly.tom.types;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class NumberType implements Type
{
    private int number;

    public NumberType(int number) {
        this.number = number;
    }

    @Override
    public void setValue(Object value)
    {
        this.number = Integer.parseInt(value.toString());
    }

    @Override
    public Object getValue()
    {
        return this.number;
    }
}

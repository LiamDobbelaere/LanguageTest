package net.digaly.tom.types;

/**
 * Created by tomdo on 30/11/2016.
 */
public class TextType implements Type {
    private String text;

    public TextType(String text) {
        this.text = text;
    }

    @Override
    public void setValue(Object value)
    {
        this.text = value.toString();
    }

    @Override
    public Object getValue()
    {
        return this.text;
    }

}

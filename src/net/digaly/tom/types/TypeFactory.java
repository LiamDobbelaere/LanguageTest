package net.digaly.tom.types;

/**
 * Created by Tom Dobbelaere on 21/11/2016.
 */
public class TypeFactory
{
    public Type typeFrom(String typeName) {
        switch(typeName) {
            case "number":
                return new NumberType(0);
            case "text":
                return new TextType("");
        }

        return new UndefinedType();
    }
}

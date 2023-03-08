package godOfJava.accessModifier.c.impl.list;

public abstract class AbstractList implements List{
    @Override
    public abstract void add();
    @Override
    public abstract void update(int index, Object value);
    @Override
    public abstract void remove(int index);

    public abstract void clear();
}

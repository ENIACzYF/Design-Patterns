package 创建型模式.原型模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/23              *
 ******************************************
 */

public abstract class Shape implements Cloneable
{
    private String id;
    protected String type;

    abstract void draw();

    public String getType()
    {
        return type;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException
    {
        Object clone = null;
        clone = super.clone();

        return clone;
    }
}

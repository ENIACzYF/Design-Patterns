package 创建型模式.工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/22              *
 ******************************************
 */

public class ShapeFactory
{
    public Shape get_Shape(String shape)
    {
        if (shape==null)
            return null;
        if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shape.equalsIgnoreCase("Square"))
            return new Square();
        else
            return null;

    }
}

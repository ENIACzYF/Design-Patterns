package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public class ShapeFactory extends AbstractFactory
{
    @Override
    public Color getColor(String color)
    {
        return null;
    }

    @Override
    public Shape getShape(String shape)
    {
        if(shape == null)
            return null;
        else if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if(shape.equalsIgnoreCase("Square"))
            return new Square();
        else if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else
            return null;
    }
}

package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public class ColorFactory extends AbstractFactory
{
    @Override
    public Color getColor(String color)
    {
        if(color == null)
            return null;
        else if(color.equalsIgnoreCase("Red"))
            return new Red();
        else if(color.equalsIgnoreCase("Green"))
            return new Green();
        else if(color.equalsIgnoreCase("Blue"))
            return new Blue();
        else
            return null;
    }

    @Override
    public Shape getShape(String shape)
    {
        return null;
    }
}

package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public class FactoryProducer
{
    public static AbstractFactory getFactory(String factory)
    {
        if(factory.equalsIgnoreCase("Shape"))
            return new ShapeFactory();
        else if(factory.equalsIgnoreCase("Color"))
            return new ColorFactory();
        else
            return null;
    }
}

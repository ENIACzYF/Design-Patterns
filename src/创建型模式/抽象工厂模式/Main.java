package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 *
 *          抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。
 *          何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
 */

public class Main
{
    public static void main(String[] args)
    {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");

        Shape shape1 = abstractFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = abstractFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = abstractFactory.getShape("Square");
        shape3.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        Color color1 = colorFactory.getColor("Red");
        color1.fill();

        Color color2 = colorFactory.getColor("Green");
        color2.fill();

        Color color3 = colorFactory.getColor("Blue");
        color3.fill();
    }
}

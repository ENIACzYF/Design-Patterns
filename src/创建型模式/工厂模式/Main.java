package 创建型模式.工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/22              *
 ******************************************
 *
 *
 *      在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，
 *      并且是通过使用一个共同的接口来指向新创建的对象。
 *      何时使用：我们明确地计划不同条件下创建不同实例时。
 */

public class Main
{
    public static void main(String[] args)
    {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.get_Shape("circle");
        Shape square = factory.get_Shape("square");
        Shape rectangle = factory.get_Shape("rectangle");

        circle.draw();
        square.draw();
        rectangle.draw();
    }

}

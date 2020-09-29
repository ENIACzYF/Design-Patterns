package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public abstract class AbstractFactory
{
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

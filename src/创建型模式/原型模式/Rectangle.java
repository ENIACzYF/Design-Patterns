package 创建型模式.原型模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/23              *
 ******************************************
 */

public class Rectangle extends Shape
{
    public Rectangle()
    {
        type = "Rectangle";
    }

    @Override
    void draw()
    {
        System.out.println("A rectangle is drew.");
    }
}

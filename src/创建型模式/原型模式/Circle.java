package 创建型模式.原型模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/23              *
 ******************************************
 */

public class Circle extends Shape
{
    public Circle()
    {
        type = "Circle";
    }

    @Override
    void draw()
    {
        System.out.println("A circle is drew.");
    }
}

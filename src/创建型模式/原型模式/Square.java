package 创建型模式.原型模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/23              *
 ******************************************
 */

public class Square extends Shape
{
    public Square()
    {
        type = "Square";
    }

    @Override
    void draw()
    {
        System.out.println("A square is drew.");
    }
}

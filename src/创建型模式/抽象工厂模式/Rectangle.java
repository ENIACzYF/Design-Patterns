package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public class Rectangle implements Shape
{
    @Override
    public void draw()
    {
        System.out.println("A rectangle is drawn.");
    }
}

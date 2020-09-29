package 创建型模式.抽象工厂模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/29              *
 ******************************************
 */

public class Green implements Color
{
    @Override
    public void fill()
    {
        System.out.println("Filled with green.");
    }
}

package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

public class Juice extends Drink
{
    @Override
    public String name()
    {
        return "Juice 好果汁";
    }

    @Override
    public double price()
    {
        return 6.99;
    }
}

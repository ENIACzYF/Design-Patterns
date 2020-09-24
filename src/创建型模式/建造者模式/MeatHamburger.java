package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

public class MeatHamburger extends Hamburger
{
    @Override
    public String name()
    {
        return "Meat Hamburger 肉汉堡";
    }

    @Override
    public double price()
    {
        return 29.99;
    }
}

package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

public class VegHamburger extends Hamburger
{
    @Override
    public String name()
    {
        return "Veg Hamburger 素汉堡";
    }

    @Override
    public double price()
    {
        return 19.9;
    }
}

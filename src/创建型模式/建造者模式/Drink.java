package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

public abstract class Drink implements Item
{
    @Override
    public Packing packing()
    {
        return new Bottle();
    }
}

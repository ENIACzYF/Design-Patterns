package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

import java.util.ArrayList;
import java.util.List;

public class Meal
{
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item)
    {
        items.add(item);
    }

    public double getCost()
    {
        double total = 0;
        for (Item item : items)
        {
            total += item.price();
        }
        return total;
    }

    public void showMessage()
    {
        for (Item item : items)
        {
            System.out.print("Name 名称：" + item.name());
            System.out.print("****Packing 包装：" + item.packing().pack());
            System.out.println("****Price 价格：" + item.price());
        }
    }
}

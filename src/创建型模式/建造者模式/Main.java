package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 *
 *      建造者模式（Builder Pattern）使用多个简单的对象一步一步构建成一个复杂的对象
 *      主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
 *      由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 */

public class Main
{
    public static void main(String[] args)
    {
        MealBuilder builder1 = new MealBuilder();
        Meal vegMeal = builder1.prepareVegMeal();

        MealBuilder builder2 = new MealBuilder();
        Meal meatMeal = builder2.prepareMeatMeal();

        System.out.println("****This is Veg Meal****");
        vegMeal.showMessage();
        System.out.println("Total Cost 总价格：" + vegMeal.getCost());

        System.out.println("****This is Meat Meal****");
        meatMeal.showMessage();
        System.out.println("Total Cost 总价格：" + meatMeal.getCost());
    }
}

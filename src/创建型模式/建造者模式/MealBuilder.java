package 创建型模式.建造者模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/24              *
 ******************************************
 */

public class MealBuilder
{
    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegHamburger());
        meal.addItem(new Juice());
        return meal;
    }

    public Meal prepareMeatMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new MeatHamburger());
        meal.addItem(new Coke());
        return meal;
    }
}

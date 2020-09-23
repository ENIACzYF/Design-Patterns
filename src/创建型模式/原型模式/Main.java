package 创建型模式.原型模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/23              *
 ******************************************
 *
 *
 *          用于创建重复的对象，同时又能保证性能。
 *          何时使用： 1、当一个系统应该独立于它的产品创建，构成和表示时。
 *                   2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *                   3、为了避免创建一个与产品类层次平行的工厂类层次时。
 *                   4、当一个类的实例只能有几个不同状态组合中的一种时。
 */

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ShapeCache.loadCache();

        Shape clone1 = (Shape) ShapeCache.getShape("1");
        System.out.println("shape:"+clone1.getType());

        Shape clone2 = (Shape)ShapeCache.getShape("2");
        System.out.println("shape:"+clone2.getType());

        Shape clone3 = (Shape)ShapeCache.getShape("3");
        System.out.println("shape:"+clone3.getType());
    }
}

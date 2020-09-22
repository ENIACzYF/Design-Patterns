package 创建型模式.单例模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/22              *
 ******************************************
 *
 *  涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。
 *  这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 *  何时使用：当您想控制实例数目，节省系统资源的时候。
 *
 */

public class Main
{
    public static void main(String[] args)
    {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.test();
    }
}

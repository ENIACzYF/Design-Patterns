package 创建型模式.单例模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/9/22              *
 ******************************************
 */

public class SingleObject
{
    private static SingleObject instance = new SingleObject();

    private SingleObject()
    {

    }

    public static SingleObject getInstance()
    {
        return instance;
    }

    public void test()
    {
        System.out.println("This is a test message!");
    }

}

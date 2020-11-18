package 结构型模式.代理模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/18
      为其他对象提供一种代理以控制对这个对象的访问
      如果对象已存在，不再new新的对象
 ******************************************
*/

public class Demo
{
    public static void main(String[] args)
    {
        Image image = new ProxyImage("test.txt");
        image.display();
        System.out.println();
        image.display();
    }
}

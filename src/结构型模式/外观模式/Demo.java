package 结构型模式.外观模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/19
       隐藏系统的复杂性
       向客户端提供了一个客户端可以访问系统的接口
 ******************************************
*/

public class Demo
{
    public static void main(String[] args)
    {
        ShapeMaker maker = new ShapeMaker();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}

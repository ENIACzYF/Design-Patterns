package 结构型模式.桥接模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/18              
 ******************************************
*/

public class IPhone extends Product
{
    @Override
    public void beProduced()
    {
        System.out.println("IPhone被生产出来......");
    }

    @Override
    public void beSold()
    {
        System.out.println("IPhone被卖出去......");
    }
}

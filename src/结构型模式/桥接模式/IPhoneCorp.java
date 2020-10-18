package 结构型模式.桥接模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/18              
 ******************************************
*/

public class IPhoneCorp extends Corp
{
    public IPhoneCorp(Product product)
    {
        super(product);
    }

    @Override
    public void makeMoney()
    {
        super.makeMoney();
        System.out.println("手机公司赚钱了......");
    }
}

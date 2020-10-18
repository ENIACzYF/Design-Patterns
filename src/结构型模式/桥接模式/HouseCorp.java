package 结构型模式.桥接模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/18              
 ******************************************
*/

public class HouseCorp extends Corp
{

    public HouseCorp(House house)
    {
        super(house);
    }

    @Override
    public void makeMoney()
    {
        super.makeMoney();
        System.out.println("地产公司赚钱了......");
    }
}

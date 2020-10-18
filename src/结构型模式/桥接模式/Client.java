package 结构型模式.桥接模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/17              
 ******************************************
 *
 * 将 抽象 和 实现 解耦，使得两者可以独立地变化
*/

public class Client
{
    public static void main(String[] args)
    {
        House house = new House();
        System.out.println("---------地产公司序列---------");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println();

        System.out.println("---------手机公司序列---------");
        IPhone iPhone = new IPhone();
        IPhoneCorp iPhoneCorp = new IPhoneCorp(iPhone);
        iPhoneCorp.makeMoney();
        System.out.println("我要重操旧业去做衣服,就拿手机公司来做......");
        System.out.println("---------服装公司序列---------");
        Clothes clothes = new Clothes();
        IPhoneCorp clothesFactory = new IPhoneCorp(clothes);
        clothesFactory.makeMoney();
    }
}

package 结构型模式.桥接模式;
/*
 ******************************************
 *           Created by ENIAC_zYF         *
 *                                        *
 *           @Date 2020/10/17             *
 ******************************************
 */

public abstract class Corp
{
    private Product product;

    public Corp(Product product)
    {
        this.product = product;
    }

    public void makeMoney()
    {
        product.beProduced();
        product.beSold();
    }
}

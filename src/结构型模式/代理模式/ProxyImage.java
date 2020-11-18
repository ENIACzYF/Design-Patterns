package 结构型模式.代理模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/18              
 ******************************************
*/

/**
 * Image的代理类
 * 减少 RealImage 对象加载的内存占用
 */
public class ProxyImage implements Image
{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void display()
    {
        if (realImage == null)
        {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

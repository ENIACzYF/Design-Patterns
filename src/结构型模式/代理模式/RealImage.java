package 结构型模式.代理模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/18              
 ******************************************
*/

public class RealImage implements Image
{
    private String fileName;

    public RealImage(String fileName)
    {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display()
    {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName)
    {
        System.out.println("Loading " + fileName);
    }
}

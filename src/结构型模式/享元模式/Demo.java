package 结构型模式.享元模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/18
    用于减少创建对象的数量，以减少内存占用和提高性能
 ******************************************
*/

public class Demo
{
    private static final String[] colors =
            {"Red", "Black", "Blue", "Green", "Yellow", "White"};

    public static void main(String[] args)
    {
        for (int i = 0; i < 20; i++)
        {
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX()
    {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY()
    {
        return (int) (Math.random() * 100);
    }
}

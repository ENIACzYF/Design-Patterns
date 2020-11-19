package 结构型模式.外观模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/19              
 ******************************************
*/

/**
 * 外观类
 */
public class ShapeMaker
{
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker()
    {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle()
    {
        this.circle.draw();
    }

    public void drawSquare()
    {
        this.square.draw();
    }

    public void drawRectangle()
    {
        this.rectangle.draw();
    }
}

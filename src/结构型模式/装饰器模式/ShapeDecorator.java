package 结构型模式.装饰器模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/9              
 ******************************************
*/

public abstract class ShapeDecorator implements Shape
{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
    }
}

package 结构型模式.装饰器模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/9              
 ******************************************
*/

public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public void draw()
    {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratorShape)
    {
        System.out.println("Border color: red");
    }
}

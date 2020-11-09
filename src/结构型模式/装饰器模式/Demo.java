package 结构型模式.装饰器模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/9
            * 向现有对象添加新功能，且不改变现有结构,灵活
 ******************************************
*/

public class Demo
{
    public static void main(String[] args)
    {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.print("Circle without decorator: ");
        circle.draw();
        System.out.println();
        System.out.print("Circle with red border: ");
        redCircle.draw();
        System.out.println();
        System.out.print("Circle with red border: ");
        redRectangle.draw();
        System.out.println();
    }
}

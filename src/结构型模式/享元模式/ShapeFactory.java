package 结构型模式.享元模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/18              
 ******************************************
*/

import java.util.HashMap;

public class ShapeFactory
{
    public static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color)
    {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
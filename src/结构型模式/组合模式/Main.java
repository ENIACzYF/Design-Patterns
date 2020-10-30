package 结构型模式.组合模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/30
            将对象组合成树形结构以表示"部分-整体"的层次结构。
            组合模式使得用户对单个对象和组合对象的使用具有一致性。
 ******************************************
*/

public class Main
{
    public static void main(String[] args)
    {
        Employee ceo = new Employee("大佬", "首席执行官", 7600000);
        Employee headSales = new Employee("张", "销售总监", 5600000);
        Employee headMarketing = new Employee("李", "市场总监", 4500000);
        ceo.add(headMarketing);
        ceo.add(headSales);

        Employee stuff1_Marketing = new Employee("小陈", "市场管理员", 54000);
        Employee stuff2_Marketing = new Employee("小猪", "市场管理员", 54000);
        Employee stuff1_Sales = new Employee("小蛤", "销售员", 55000);
        Employee stuff2_Sales = new Employee("小憨", "销售员", 55000);

        headMarketing.add(stuff1_Marketing);
        headMarketing.add(stuff2_Marketing);
        headSales.add(stuff1_Sales);
        headSales.add(stuff2_Sales);

        System.out.println(ceo);
        for (Employee headLeader : ceo.getSubEmployee())
        {
            System.out.println(headLeader);
            for (Employee subStuff : headLeader.getSubEmployee())
            {
                System.out.println(subStuff);
            }
        }
    }
}

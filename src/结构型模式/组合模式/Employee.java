package 结构型模式.组合模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/10/30              
 ******************************************
*/

import java.util.ArrayList;
import java.util.List;

public class Employee
{
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subEmployee;

    public Employee(String name, String dept, int salary)
    {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subEmployee = new ArrayList<Employee>();
    }

    public void add(Employee employee)
    {
        subEmployee.add(employee);
    }

    public void remove(Employee employee)
    {
        subEmployee.remove(employee);
    }

    public List<Employee> getSubEmployee()
    {
        return subEmployee;
    }

    @Override
    public String toString()
    {
        return "Employee: " +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary;
    }
}

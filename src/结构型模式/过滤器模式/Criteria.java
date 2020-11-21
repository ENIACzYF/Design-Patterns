package 结构型模式.过滤器模式;

import java.util.List;

public interface Criteria
{
    public List<Person> meetCriteria(List<Person> persons);
}

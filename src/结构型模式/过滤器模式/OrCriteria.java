package 结构型模式.过滤器模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/21              
 ******************************************
*/

import java.util.List;

public class OrCriteria implements Criteria
{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria)
    {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons)
    {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems)
        {
            if (!firstCriteriaItems.contains(person))
            {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}

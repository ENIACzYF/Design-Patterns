package 结构型模式.过滤器模式;
/*
 ******************************************
            Powered by ENIAC_zYF         
                                        
            @Date 2020/11/21              
 ******************************************
*/

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria
{
    @Override
    public List<Person> meetCriteria(List<Person> persons)
    {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons)
        {
            if (person.getGender().equalsIgnoreCase("Male"))
            {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}

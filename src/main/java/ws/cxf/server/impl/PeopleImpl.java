package ws.cxf.server.impl;

import bean.People;
import ws.cxf.server.IPeople;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
public class PeopleImpl implements IPeople {
    @Override
    public People queryPeople() {
        People people = new People();
        people.setId(1);
        people.setName("mfl");
        people.setGender("man");
        people.setBirth(new Date());
        return people;
    }

    @Override
    public List<People> queryAllPeople() {
        return null;
    }

}

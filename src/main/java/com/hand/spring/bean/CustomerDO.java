package com.hand.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Peter
 * @ClassName: CustomerDO
 * @Description: TODO
 * @date 2019/1/14 11:42
 * @Version 1.0
 */
public class CustomerDO {

    private List list;
    private Map<Object,Object> map;
    private Set<Object> set;
    private Properties properties;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map<Object, Object> getMap() {
        return map;
    }

    public void setMap(Map<Object, Object> map) {
        this.map = map;
    }

    public Set<Object> getSet() {
        return set;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "CustomerDO{" +
                "list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}

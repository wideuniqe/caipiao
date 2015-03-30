package org.gradle;

import org.apache.commons.collections.list.GrowthList;
/**
 * 人员类
 * @author IBM
 *
 */
public class Person {
    private final String name;
    /**
     * 构造函数
     * @param name
     */
    public Person(String name) {
        this.name = name;
        new GrowthList();
    }
    /**
     * 添加姓名
     * @return
     */
    public String getName() {
        return name;
    }
}

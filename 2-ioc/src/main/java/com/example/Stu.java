package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Date:2021/02_11:16 上午
 * @Description：
 */
public class Stu {

    private String[] strings;
    private List<String> list;
    private Map<Integer,String> map;

    @Override
    public String toString() {
        return "Stu{" +
                "strings=" + Arrays.toString(strings) +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    public String[] getStrings() {
        return strings;
    }

    public void setStrings(String[] strings) {
        this.strings = strings;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }
}

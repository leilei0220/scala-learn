package com.leilei.demo14_array;

/**
 * @author lei
 * @version 1.0
 * @date 2021/7/28 20:39
 * @desc
 */
public class Trader {
    private final String name;
    private final String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString(){
        return "Trader:"+this.name + " in " + this.city;
    }

}

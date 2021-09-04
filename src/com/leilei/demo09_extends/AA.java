package com.leilei.demo09_extends;

/**
 * @author lei
 * @version 1.0
 * @date 2021/8/29 19:38
 * @desc
 */
public class AA {
    public static void main(String[] args) {
        Car car = new Car();
        if (car instanceof Vehicle) {
            System.out.println("car 属于vehicle");
            Vehicle vehicle = (Vehicle) car;
            vehicle.run();
        }
    }
}

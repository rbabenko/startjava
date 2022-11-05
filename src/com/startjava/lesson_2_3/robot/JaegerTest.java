package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setHeight(79.25);
        jaeger1.setWeight(1.980);
        jaeger1.setSpeed(7);
        jaeger1.setStrength(8);
        jaeger1.setArmor(6);

        Jaeger jaeger2 = new Jaeger("Striker Eureka", "Mark-5", 76.2, 1.850, 10, 10, 9);

        jaeger1.move();
        jaeger1.run();

        jaeger2.jump();
        jaeger2.kill();

        jaeger1.setArmor(10);
        System.out.println(jaeger1.getMark());

        jaeger2.setSpeed(2);
        System.out.println(jaeger2.getName());
    }
}

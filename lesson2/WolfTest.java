package lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.nickName = "Wolf";
        wolf.age = 5;
        wolf.sex = "m";
        wolf.color = "grey";
        wolf.weight = 90.7;

        System.out.printf("nickname: %s\n", wolf.nickName);
        System.out.printf("age: %d\n", wolf.age);
        System.out.printf("sex: %s\n", wolf.sex);
        System.out.printf("color: %s\n", wolf.color);
        System.out.printf("age: %.2f\n", wolf.weight);

        wolf.howl();
        wolf.hunt();
        wolf.move();
        wolf.run();
        wolf.sit();
    }
}

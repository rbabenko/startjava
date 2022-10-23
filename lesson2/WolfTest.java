package lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickName("Wolf");
        wolf.setAge(5);;
        wolf.setSex("m");;
        wolf.setColor("grey");;
        wolf.setWeight(90.7);;

        System.out.printf("nickname: %s\n", wolf.getNickName());
        System.out.printf("age: %d\n", wolf.getAge());
        System.out.printf("sex: %s\n", wolf.getSex());
        System.out.printf("color: %s\n", wolf.getColor());
        System.out.printf("age: %.2f\n", wolf.getWeight());

        wolf.howl();
        wolf.hunt();
        wolf.move();
        wolf.run();
        wolf.sit();
    }
}

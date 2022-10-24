package lesson2;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private int number;

    private int startRange = 0;
    private int endRange = 100;

    public Player(String name) {
        id = UUID.randomUUID();
        this.name = name;
        number = 1 + (int) (Math.random() * 100);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return id.equals(player.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public void calculate(String type) {
        if (type.equals("less")) {
            startRange = number;
            number = (endRange - number) / 2 + number;
        } else if (type.equals("more")) {
            endRange = number;
            number = (number - startRange) / 2;
        }
    }
}

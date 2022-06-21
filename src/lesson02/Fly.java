package lesson02;

public class Fly {
    int legs = 6;
    String name = "Maggot";

    public Fly(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

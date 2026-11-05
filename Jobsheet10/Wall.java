package Jobsheet10;

public class Wall implements Damageable {
    private int durability;

    public Wall(int durability) {
        this.durability = durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return this.durability;
    }

    @Override
    public void damaged() {
        this.durability -= 8;
    }

    public String getWallInfo() {
        return "Wall Durability = " + this.durability + "\n";
    }
}

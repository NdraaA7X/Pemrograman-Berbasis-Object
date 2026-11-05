package Jobsheet10;

public class Golem extends Monster {
    public Golem(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (this.level == 1) {
            this.health += this.health * 20 / 100;
        } else if (this.level == 2) {
            this.health += this.health * 30 / 100;
        } else if (this.level == 3) {
            this.health += this.health * 45 / 100;
        }
    }

    @Override
    public void damaged() {
        this.health -= this.health * 15 / 100;
    }

    @Override
    public String getMonsterInfo() {
        return "Golem Data =\n" + super.getMonsterInfo();
    }
}

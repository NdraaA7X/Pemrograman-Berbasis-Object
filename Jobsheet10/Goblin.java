package Jobsheet10;

public class Goblin extends Monster {
    public Goblin(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        if (this.level == 1) {
            this.health += this.health * 15 / 100;
        } else if (this.level == 2) {
            this.health += this.health * 25 / 100;
        } else if (this.level == 3) {
            this.health += this.health * 35 / 100;
        }
    }

    @Override
    public void damaged() {
        this.health -= this.health * 25 / 100;
    }

    @Override
    public String getMonsterInfo() {
        return "Goblin Data =\n" + super.getMonsterInfo();
    }
}

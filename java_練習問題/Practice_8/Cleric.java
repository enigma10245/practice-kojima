package Practice_8;

public class Cleric {
    String name;
    int hp = 50;
    final int maxHp = 50;
    int mp = 10;
    final int maxMp = 10;

    void selfAid() {
        this.mp -= 5;
        this.hp = this.maxHp;
    }

    public int pray(int sec) {
        int heal = new java.util.Random().nextInt(3) + sec;
        int total = heal + this.mp;

        if (this.maxHp <= total) {
            heal = this.maxMp - this.mp;
            this.mp = this.maxMp;
        }
        else {
            this.mp += heal;
        }
        return heal;
    }

}

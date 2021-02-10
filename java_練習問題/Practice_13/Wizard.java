public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recovPoint);
        System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        } 
        else {
            this.hp = hp;
        }
    }
    
    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            Erorr();
        }
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name.length() < 3 || name == null) {
            Erorr();
        }
        this.name = name;
    }
    
    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            Erorr();
        }
        this.wand = wand;
    }

    private void Erorr() {
        throw new IllegalArgumentException("処理を中断");
    }
}

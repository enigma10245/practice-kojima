public class Wand {
    private String name;
    private double power;

    public void setName(String name) {
        int name_limit = 3;
        if (name.length() < name_limit || name == null) {
            Erorr();
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPower(double power) {
        double lowPower_limit = 0.5;
        double maxPower_limit = 100;
        if (power < lowPower_limit && power > maxPower_limit) {
            Erorr();
        }
        this.power = power;
    }

    public double getPower() {
        return this.power;
    }

    private void Erorr() {
        throw new IllegalArgumentException("処理を中断");
    }
}
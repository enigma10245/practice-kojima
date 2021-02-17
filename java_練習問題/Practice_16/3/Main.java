import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero saitou = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");
        Map<Hero, Integer> heros = new HashMap<Hero,Integer>();
        heros.put(saitou,3);
        heros.put(suzuki,7);

        for (Hero h : heros.keySet()) {
            int value = heros.get(h);
            System.out.println(h.getName() + "が倒した敵" + value);
        }
    }
}

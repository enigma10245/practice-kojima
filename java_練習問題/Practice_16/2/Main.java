import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero saitou = new Hero("斎藤");
        Hero suzuki = new Hero("鈴木");
        List<Hero> heros = new ArrayList<Hero>();
        heros.add(saitou);
        heros.add(suzuki);

        for (Hero h : heros) {
            System.out.println(h.getName());
        }
    }
}

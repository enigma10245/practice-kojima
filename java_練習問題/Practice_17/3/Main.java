public class Main {
    public static void main(String[] args) {
        try{
            int i =Integer.parseInt("三");
        } catch (NumberFormatException numberFormat) {
            System.out.println("NumberFormatException 例外をcatchしました");;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException nullPointer) {

            System.out.println("NullPointerException 例外をcatchしました");
            System.out.println("ーースタックトレース(ここから)ーー");
            e.printStackTrace();
            System.out.println("ーースタックトレース(ここまで)ーー");
        }
    }
}

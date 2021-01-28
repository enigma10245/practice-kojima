public class Practice4_4 {
    public static void main(String[] args) {

        //1
        int[] numbers = { 3, 4, 9 };

        //2
        System.out.println("1桁の数字を入力してください");

        //3
        int input = new java.util.Scanner(System.in).nextInt();

        //4
        for (int n : numbers) {
            if (n == input) {
                System.out.println("アタリ！");
            }
        }
        
    }
}

import java.util.Scanner;
public class Practice2_3 {
    

    public static void main(String[] args) {

        System.out.println("ようこそ占いの館へ");
        System.out.println("名前を入力してください");
        
        Scanner nameScanner = new java.util.Scanner(System.in);//Open
        String name =  nameScanner.nextLine();
        nameScanner.close();                                   //Close
        System.out.println("年齢を入力してください");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気は" + fortune + "です");
        System.out.println("1:大吉 2:中吉 3:吉 4:大凶");
    }
}

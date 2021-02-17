public class Main {
    public static void main(String[] args){
        StringBuilder stringBuilder =new StringBuilder();
        for(int i=0;i<100;i++){
            stringBuilder.append(i+1).append(",");
        }
        String s = stringBuilder.toString();
        String[] a = s.split(",");
    }
}
public class BankAccount {
    String accountNumber = "4649";
    int balance = 1592;

    public String toString() {
        return "￥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankAccount) {
            BankAccount a = (BankAccount) obj;
            String ans1 = this.accountNumber.trim();
            String ans2 = a.accountNumber.trim();
            if (ans1.equals(ans2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        BankAccount a = new BankAccount();
        System.out.println(a);
    }
}

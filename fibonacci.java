public class fibonacci {
    public static void main(String[] args) {
        int n = 10, ilk = 0, ikinci = 1;
        System.out.println(n + " Sayısına kadar olan fibonacci serisi:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(ilk + ", ");

            int siradaki = ilk + ikinci;
            ilk = ikinci;
            ikinci = siradaki;
        }
    }
}

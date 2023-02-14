public class Shuffle
{
    static int x = 3;
    public static void main(String[] args) {
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }

            if (x == 2) {
                System.out.print("b c");
            }
        }
    }
}

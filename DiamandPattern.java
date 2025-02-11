
public class DiamandPattern {

    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1rst part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // Lower part 
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1rst part 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

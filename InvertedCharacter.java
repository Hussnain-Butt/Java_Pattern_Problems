
public class InvertedCharacter {

    public static void main(String[] args) {
        int n = 4;
        char character = 'A';
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
                character++;
            }
            System.out.println();
        }
    }
}

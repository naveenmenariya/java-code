public class CharacterPattern {
    public static void main(String[] args) {
        char ch = 'A';
        int n = 5; // Change this value to adjust the size of the triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
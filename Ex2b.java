// Ex : 2b - Display star pattern using nested loops

public class Ex2b {
    public static void main(String[] args) {
        int rows = 3;

        // Outer loop controls the number of rows (1 to 3)
        for (int i = 1; i <= rows; i++) {
            // Inner loop prints stars equal to current row number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move cursor to next line after each row
            System.out.println();
        }
    }
}

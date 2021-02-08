import java.util.Scanner;

class GreetingsFromLoj {

    /**
     * Returns the total number of problems.
     *
     * @param a denotes the number of problems in the first computer
     * @param b denotes the number of problems in the second computer
     */
    static int sum(int a, int b) {
        // Implement this method
    }

    /**
     * Takes care of the problem input and output.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int caseno = 1; caseno <= cases; ++caseno) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
          System.out.println("Case " + caseno + ": " + (a + b));
        }
    }
}

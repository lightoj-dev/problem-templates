import java.util.Scanner;

class Brush {

    /**
     * Returns the total required dust units.
     *
     * @param n denotes the number of students
     * @param dustUnit denotes the dust unit for each of the students
     */
    static int totalDustUnits(int n, int[] dustUnit) {
        // Implement this method
    }

    /**
     * Takes care of the problem input and output.
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int caseno = 1; caseno <= cases; ++caseno) {
            int n = scanner.nextInt();
            int[] dustUnit = new int[n];
            for (int i = 0; i < n; ++i) {
                dustUnit[i] = scanner.nextInt();
            }
            System.out.println("Case " + caseno + ": " + totalDustUnits(n, dustUnit));
        }
    }
}

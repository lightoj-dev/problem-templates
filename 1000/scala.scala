object GreetingsFromLightOJ {

    /**
     * Returns the total number of problems.
     *
     * @param a denotes the number of problems in the first computer
     * @param b denotes the number of problems in the second computer
     */
    def sum(a: Int, b: Int): Int = {
        // Implement this method
    }


    /**
     * Takes care of the problem input and output.
     */
    def main(args: Array[String]) {
        val cases = readInt()
        for (caseno <- 1 to cases) {
            val Array(a, b) = readLine() split " " map (_.toInt)
            println("Case " + caseno + ": " + (a + b))
        }
    }
}

package main

import "fmt"

/**
 * Returns the total number of problems.
 *
 * @param a denotes the number of problems in the first computer
 * @param b denotes the number of problems in the second computer
 **/
func sum(a, b int) int {
    // Implement this method
    
}

/**
 * Takes care of the problem input and output.
 **/
func main() {
    var cases int
    fmt.Scan(&cases)

    for caseno := 1; caseno <= cases; caseno++ {
        var a, b int
        fmt.Scan(&a, &b)
        fmt.Printf("Case %d: %d\n", caseno, sum(a, b))
    }
}

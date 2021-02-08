/**
 * Returns the total number of problems.
 *
 * @param a denotes the number of problems in the first computer
 * @param b denotes the number of problems in the second computer
 */
function sum($a, $b) {
    // Implement this method
}

/**
 * Takes care of the problem input and output.
 */
function greetingsFromLightOJ() {
  	$cases = intval(fgets(STDIN));
    for ($caseno = 1; $caseno <= $cases; ++$caseno) {
      	$line = explode(" ", fgets(STDIN));
      	$a = intval($line[0]);
      	$b = intval($line[1]);

      	fwrite(STDOUT, 'Case ' . $caseno . ': ' . sum($a, $b) . "\n");
	}
}

greetingsFromLightOJ();

readline = require("readline");

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

function readLine() {
    return inputString[currentLine++];
}

process.stdin.on('end', function() {
    inputString = inputString.split('\n');
    run_it();
});

function solution(a, b, c){
    // Implement your solution here.
}

function run_it() {
    const nCases = parseInt(readLine().trim());
    
    for(let i=1; i<=nCases;i++){
        const singleCase = readLine().split(' ');
        singleCase.map(x => parseInt(x));
        let solutionResponse = solution(singleCase[0], singleCase[1], singleCase[2])
        console.log(`Case ${i}: ${solutionResponse}`);
    }
}
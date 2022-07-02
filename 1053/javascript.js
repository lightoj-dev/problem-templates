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

function solution(singleCase){
    let aSq = singleCase[0] * singleCase[0];
    let bSq = singleCase[1] * singleCase[1];
    let cSq = singleCase[2] * singleCase[2];
    if(
        (aSq + bSq) === cSq ||
        (cSq + bSq) === aSq ||
        (aSq + cSq) === bSq){
        return "yes";
    }
    return "no";
}

function run_it() {
    const nCases = parseInt(readLine().trim());
    
    for(let i=1; i<=nCases;i++){
        const singleCase = readLine().split(' ');
        console.log("Case " + i + ": " + solution(singleCase));
    }
}
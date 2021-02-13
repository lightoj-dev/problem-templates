#include<bits/stdc++.h>
using namespace std;

/**
 * Returns  the number of problems stored in each computer.
 * @param n denotes the total number of problems.
 */
vector<int> problemsStored(int n){
    // Implement this method

}

/**
 * Takes care of the problem input and output.
 */
int main(){
    int T;
    scanf("%d", &T);
    while(T--){
        int n;
        scanf("%d", &n);
        
        vector<int> ans = problemsStored(n);
        printf("%d %d\n",ans[0], ans[1]);
    }
    return 0;
}
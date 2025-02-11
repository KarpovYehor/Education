n = 5;
1 + 2 + 3 + 4 + 5 = 15

int sum = 0;
for(int i = 0; i <= n; i++){
    sum += i;
}

let sum = 0;
for(int i = 0; i <= n; i++){
    sum += i;
}

function sumRecursion(n){  // 5
    //base case
    if(n == 1){
        return 1;
    }
    //recurrent case
    let previousResult = sumRecursion(n - 1)
    let sum = sum + previousResult;
    return sum;
}
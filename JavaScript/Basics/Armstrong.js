let n = 153
let temp = n
let res = 0
let count = cnt(n)
while (n > 0) {
    res = res + pow(n % 10, count)
    n = Math.floor(n / 10)
}
console.log(temp == res);


function pow(m, t) {
    let pow = 1;
    for (let i = 1; i <= t; i++) {
        pow = pow * m
    }
    return pow
}
function cnt(n) {
    let cnt = 0
    while (n > 0) {
        cnt++
        n = Math.floor(n / 10)
    }
    return cnt
}



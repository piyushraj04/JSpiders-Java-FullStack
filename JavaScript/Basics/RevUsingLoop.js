var n = 456
var res = 0
while(n!=0){
    res = (res*10)+(n%10);
    n = Math.floor(n/10);
}
console.log(res);

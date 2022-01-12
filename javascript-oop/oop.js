const arr = [1,2,3,4,5,6];
const arr2 = arr.map(el => Math.random()*500)

console.log(arr2); 

function Teacher() {
    this.help = "im helping"
}

const teacher = new Teacher()
console.log(teacher.help)
console.log(teacher.hasOwnProperty)
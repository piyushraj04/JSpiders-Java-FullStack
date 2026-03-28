// const { createElement } = require("react");

// let table = document.createElement("table");
// let th = document.createElement("th");
// let td = document.createElement("td");

//task-->>>> ['Apple','Google','Nokia','Samsung','Nothing']
// ordered list and unordered list and append these brands using forEach

let body = document.body
let h1 = document.createElement("h1")
h1.textContent = "Unordered list"
let h2 = document.createElement("h2")
h1.textContent = "Unordered list-2"
body.append(h1,h2)

body.prepend(h1)


let para = document.createElement("p")
para.textContent = "I am paragraph"
body.append(para)
body.prepend(para)
body.after(para)
body.before(para)


let mobiles = ['Apple', 'Google', 'Nokia', 'Samsung', 'Nothing'];

let ul = document.createElement("ul");
let container = document.getElementById("container");
mobiles.forEach(el => {
    let li = document.createElement('li');
    li.textContent = el;
    // li.append(el);
    ul.append(li);
});
ul.prepend(h1)
container.append(ul);

let heading = document.createElement("h1")
heading.textContent = "Ordered List"

let ol = document.createElement("ol")

let divv2 = document.getElementById("container")
mobiles.forEach(el=>{

    let li = document.createElement("li")
    li.textContent = el;
    ol.append(li)
})
divv2.append(ol)

ul.append(heading)



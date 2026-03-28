// let newpage;
// let openredbus = () => {
//     newpage = open("https://www.redbus.com/","_blank","height=500px width=500px");
// };

// let closeredbus = () => {
//     newpage.close();
// }

// <!doctype html>
// <html lang="en">
//   <head>
//     <meta charset="UTF-8" />
//     <meta name="viewport" content="width=device-width, initial-scale=1.0" />
//     <title>Document</title>
//   </head>
//   <body>
//     <span name="text">abcd</span>
//     <span name="text">def</span>
//     <span name="text">abcd</span>
//     <span name="text">def</span>
//     <div>abcd</div>
//     <div>def</div>
//     <h1 id="dom">Document Object Model</h1>
//     <p class="para">
//       Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ipsa,
//       voluptates.
//     </p>
//     <p class="para">
//       Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ipsa,
//       voluptates.
//     </p>
//     <p class="para">
//       Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ipsa,
//       voluptates.
//     </p>
//     <p class="para">
//       Lorem ipsum dolor, sit amet consectetur adipisicing elit. Ipsa,
//       voluptates.
//     </p>

//     <script src="./dom.js"></script>
//   </body>
// </html>



// dom.js
//Javascript

// console.log(document);
// console.log(document.body);
// console.log(document.body.h1);
// console.log(document.body.children[0]);

//? DOM SELECTORS:
// ?1. document.getElementById()
// returns single element
// let h1=document.getElementById("dom")
// console.log(h1)

// ?2.getElementsByClassName()
// let para = document.getElementsByClassName("para");
//returns htmlCollection which is almost similar to array but not array(no array methods are allowed) only indexes can be accessed
// console.log(para);

// ?3.getElementsByTagName():
//returns htmlCollection which is almost similar to array but not array(no array methods are allowed) only indexes can be accessed
// let paraTag = document.getElementsByTagName("p");
// console.log(paraTag);

// ?4. getElementsByName():
//returns NodeLists which is almost similar to array but not arrayno array methods are allowed except forEach
// let span = document.getElementsByName("text");
// console.log(span[0]);
// span.forEach((el) => {
//   console.log(el);
// });

// ?5. querySelector()
// let h1 = document.querySelector("#dom");
// console.log(h1);

// let paras = document.querySelector(".para");
// console.log(paras);

// ?6. querySelectorAll():
//returns NodeLists which is almost similar to array but not arrayno array methods are allowed except forEach
// let paras = document.querySelectorAll("p");
// console.log(paras);


// let para = document.querySelector("#para")

// console.log(para.innerText);
// console.log(para.innerHTML);
// console.log(para.textContent);

// para.innerText = "<b>Replaced</b>"

// para.innerHTML= "<b>Replaced</b>"

// para.textContent= "<b>Replaced</b>"
// console.log(para.textContent);

//create element

let body = document.body;
let h1 = document.createElement("h1");
h1.innerHTML = "This is h1 tag...";
body.appendChild(h1);

let para = document.createElement("p");
para.innerHTML="This is paragraph tag";
body.appendChild(para);

let bold = document.createElement("b");
bold.innerHTML="This is bold...";
body.appendChild(bold);

let span = document.createElement("span")
span.innerHTML="This is span..."
body.append(span)

let para1 = document.createElement("p");
para1.innerHTML="This is paragraph-1 tag from DOM";

let para2 = document.createElement("p");
para2.innerHTML="This is paragraph-2 tag from DOM";

let para3 = document.createElement("p");
para3.innerHTML="This is paragraph-3 tag from DOM";

let para4 = document.createElement("p");
para4.innerHTML="This is paragraph-4 tag from DOM";

let para5 = document.createElement("p");
para5.innerHTML="This is paragraph-5 tag from DOM";

body.append(para1,para2,para3) //take all parameters

// body.appendChild(para4,para5) //avoid from second parameter
// body.appendChild(para5) 



console.log("------------------------------------------------");






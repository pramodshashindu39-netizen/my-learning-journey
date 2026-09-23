console.log("Hii Again ");
console.log("This is my first External JavaScript");

//==================================================================
//Variables 
//==================================================================

console.log("\n\n");

let name = "Shasindu Pramod";
console.log(name);
console.log(typeof name);

let studentName = "Shasindu Pramod" ;
let studentPass = true;
let studentAge = [];
let student = {};

console.log(typeof studentName);
console.log(typeof studentAge);
console.log(typeof studentPass);
console.log(typeof student);

//==================================================================
//Arithmatic Operators
//==================================================================

console.log("\n\n");

let x=10;
let y=8;
let z=x*y;
console.log(z);
console.log(x+y);
console.log(x-y);
console.log(x/y);
console.log(x%y);

let a="Shasindu";
console.log(a*x);
console.log(a+x);

//==================================================================
//Comparison Operators

//== (value ), === (type & value ), !=, !== (type and value ), >, <, >=, <=

//==================================================================

console.log("\n\n");

let num1=10;
let num2=20;    
let num3="10";

console.log(num1==num1);
console.log(num1===num3);
console.log(num1==num3);
console.log(num1!=num2);
console.log(num1!==num3);
console.log(num1>num2);
console.log(num1<num2);
console.log(num1>=num2);
console.log(num1<=num2);
console.log(num3==num2);
console.log(num3===num2);
console.log(num3!=num2);

//========================================================
//Logical Operators
// && (AND), || (OR), ! (NOT)
//========================================================

console.log("\n\n");

let isRaining = true;
let isSunny = false;

console.log(isRaining && isSunny); // false
console.log(isRaining || isSunny); // true
console.log(!isRaining); // false

//========================================================
//if else statements
//========================================================

console.log("\n\n");

if (true && false) {
    console.log("Both conditions are true");
}else if (true || false) {
    console.log("At least one condition is true");
}else {
    console.log("Both conditions are false");   
}       

if (true && true) {
    console.log("Both conditions are true");
}else if (true || false) {
    console.log("At least one condition is true");
}else {
    console.log("Both conditions are false");   
}   

// Grade Assignment
console.log("\n\n");

let marks = 65;

if (marks >= 75) {
    console.log("Grade: A");
}else if(marks >=60){
    console.log("Grade: B");
}else if(marks >=50){
    console.log("Grade: C");
}else if(marks >=30){
    console.log("Grade: S");
}else{
    console.log("Not Grade , Fail");
}

console.log("\n\n");

let age = 13;

if(age > 18){
    console.log("You can access this website");
}else{
    console.log("You cannot access this website");   
}

console.log("\n\n");

let units= 20;
let bill=0;

if(units <= 50){
    bill = units * 10;
}else if(units <= 100){
    bill = units * 15;
}else{
    bill = units * 20;
}

console.log("Your bill is: " + bill);

//==================================================================
//switch case statements
//==================================================================

console.log("\n\n");

let day = 8

switch(day){
    case 1:
        console.log("Monday");
        break;
    case 2:
        console.log("Tuesday");
        break;
    case 3:
        console.log("Wednesday");
        break;
    case 4:
        console.log("Thurrsday");
        break;
    case 5:
        console.log("Friday");
        break;
    case 6:
        console.log("Saturday");
        break;
    case 7:
        console.log("Sunday");
        break;
    default:
        console.log("Innvalid Day");
        break
}

//==================================================================
//for - loop statements
//==================================================================

console.log("\n\n");

for(let i=0; i< 10 ;i++){
    console.log(i);
}

//==================================================================
//while - loop statements
//==================================================================

console.log("\n\n");

let i=0;
while(i==10){
    console.log(i);
    i++;
}

let number=0;
let total=0;

while(number<10){
    total += number;
    console.log("Total is: " , total); // Concatanation + or , can use
    console.log("Total is: " + total); // We do not use + to concatanate string and number in console.log() 
                                       // because it will convert the number to string and then concatanate it with the string.
                                       // So we use "," to concatanate string and number in console.log()
    number++;
}


//==================================================================
//Do - while - loop statements
//==================================================================

console.log("\n\n");

while(false){
    console.log("This is while loop");
}


do{
    console.log("This is do while loop");

}while(false);

//==================================================================
//Functions
//==================================================================

console.log("\n\n");

function addNumbers(num1, num2){
    let sum = num1 + num2;
    return sum;
}

let result = addNumbers(10, 20);
console.log("The sum is : " , result);

console.log("The sum is : ", addNumbers(10, 20));

//------------Function Expression-------------------

console.log("\n\n");

let c=function(){
    console.log("This is a function expression");
}

console.log(c());

//------------Arrow Function-------------------

console.log("\n\n");

let age1 =()=>{
    console.log("This is an arrow function " , " I am 21 years old");  
}

console.log(age1());


let age2 =()=> console.log("This is an arrow function one line  " , " I am 21 years old");

console.log(age2());

//==================================================================
//Arrays
//==================================================================

console.log("\n\n");

let fruits = ["Apple", "Banana", "Orange"];
console.log(fruits);

console.log("\n\n");

let mixedArray = ["Apple", 5, true, null];
console.log(mixedArray);

for(let i=0; i<mixedArray.length; i++){
    console.log(mixedArray[i]);
}

console.log("\n\n");

console.log(typeof mixedArray, " length is  : ", mixedArray.length);

console.log("\n\n");

//==================================================================
//Objects
//==================================================================

let person = {
    name: "Shasindu Pramod",
    age: 21,
    isStudent: "Student",
    guardianName: "Mrs . Rathna Irangani",
    address: "Horana, Bulathsinhala"
}

console.log(person);

console.log("\n\n");

console.log(person.name);
console.log(person.age);
console.log(person.isStudent);
console.log(person.guardianName);
console.log(person.address);

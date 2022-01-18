let helloWorld = "Hello World";
console.log(helloWorld);

// when you see an interface think of a contract
// all objects with the type User
// need to follow this contract
interface User {
  name: string;
  id: number;
}

// to use a type, we type it out after the reference
// like so: reference: TypeName
const user: User = {
  name: "Hayes",
  id: 0,
};

// below throws an error because id is set to a value
// of the wrong type!
// const secondUser: User = {
//     name: "Bob",
//     id: "1"
// }

// we have access to basic primitive type
let iSCompleted: boolean = false;

// note we also have access to
// modern permutations of number
// including binary et al
let decimal: number = 6;
let hex: number = 0xf00d;
let binary: number = 0b1010;
let octal: number = 0o744;
let big: bigint = 100n;

// array types
let numArray: number[] = [1, 2, 3];
// below is a generic type
// Array has a generic of number
// this can be replaced with any other type
let list: Array<number> = [1, 2, 3];

// below we have tuples
// this type is exclusive to javascript
let myTuple: [string, number];

myTuple = ["hello", 10];
// myTuple = [10, "hello"];

// enums are also exclusive to TypeScript
enum Color {
  Red,
  Green,
  Blue,
}

enum Action {
  increment,
  decrement,
}

let myColor: Color = Color.Green;

// unknown represent a type that we do not know
// when we declare a variable
// because this is unknown, we can reassign it to
// a value of a different type
let notSure: unknown = 4;
notSure = "this is a string actually";

// we also have the any type
// this allows us to opt-out of type checking all together
// declare is a way to denote that this function exists in our code
declare function getValue(key: string): any;
const str: string = getValue("myString");

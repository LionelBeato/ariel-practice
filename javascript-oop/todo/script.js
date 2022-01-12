console.log("hello from script!")

function onSubmit() {
    let input = document.getElementById("input");
    let newTodo = document.createElement("DIV");
    let list = document.getElementById("list");
    let deleteButton = document.createElement("button");
    let checkbox = document.createElement("input");
    let text = document.createElement("span");
    checkbox.setAttribute("type", "checkbox");

    console.log(input.value)
    deleteButton.innerText = "Delete";
    text.innerText = input.value;

    newTodo.appendChild(text);
    newTodo.appendChild(checkbox);
    newTodo.appendChild(deleteButton);
    list.appendChild(newTodo);

    deleteButton.onclick = () => deleteThis(newTodo);
    checkbox.onclick = () => markCompleted(newTodo);

}

function deleteThis(t) {
    console.log("deleting...")
    console.log(t);
    t.remove();
}

function markCompleted(newTodo) {
    console.log("item completed!");
    console.log(newTodo);

    newTodo.childNodes[0].style = "text-decoration: line-through";



    // text.style.textDecoration = "linethrough";

}
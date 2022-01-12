function calculateTip() {
    let total = Number(document.getElementById('total').value);
    let eighteen = Number(document.getElementById('eighteen').value);
    let twenty = Number(document.getElementById('twenty').value);

    //calculate based on tip percent
    console.log(eighteen.checked);
}

let div = document.getElementById("div");

function deleteMe(this) {
    this.remove();
}
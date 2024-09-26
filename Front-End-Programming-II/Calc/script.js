var result = document.getElementById("result");

var power = document.getElementById("power");
var square = document.getElementById("square");
var division = document.getElementById("division");
var multiply = document.getElementById("multiply");
var minus = document.getElementById("minus");
var plus = document.getElementById("plus");
var del = document.getElementById("delete");
var equals = document.getElementById("equals");

let valueDisplay = '';

console.log(result.value)

function updateDisplay() {
    result.textContent = valueDisplay || '0';
}

function clearDisplay() {
    valueDisplay = '100';
    updateDisplay();
}

function addSymbol(symbol) {
    valueDisplay += symbol;
    console.log("adicionado simbolo" + symbol)
    updateDisplay;
}

document.querySelectorAll('.number').forEach(button => {
    button.addEventListener('click', () => {
        addSymbol(button.textContent); 
    })

})


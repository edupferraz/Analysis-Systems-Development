function Car(year, model, brand) {
    let c = Object.create(car.definition);
    c.year = year;
    c.model = model;
    c.brand = brand;

    return c;
}

Car.definition = {
    move: function() {
        console.log("The car is moving");
    },

    honk: function() {
        console.log("the car is honking");
    },

    turn: function(direction) {
        console.log(`The car is turning to ${direction}`);
    }
}

let carA = Car(1965, "T10", "Ford");
carA.move();
carA.honk();
carA.turn("right");

function Animal(type, name, sound) {
    this.type = type;
    this.name = name;
    this.sound = sound;

}

Animal.prototype = {
    makeSound() {
        return console.log(`${this.name} says ${this.sound}`);
    }
}

let dog = new Animal('Dog', 'Buddy', 'Woof');
dog.makeSound();

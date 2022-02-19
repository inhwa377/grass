const calculator = {
    add : function(a , b){
        console.log(a + b);
    },
    minus : function(a, b){
        console.log(a - b);
    },
    power : function(a, b){
        console.log(a**b);
    },
    divide : function(a, b){
        console.log(a / b);
    }
};

calculator.add(5, 6);
calculator.minus(10, 2);
calculator.power(4, 5);
calculator.divide(20, 3);
